import namegenerator.Converters.ChampionListToChampionNamesArrayConverter;
import namegenerator.Helpers.ChampionsFilter;
import namegenerator.Helpers.JSONParser;
import namegenerator.Models.Champion;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Randomizer extends JFrame {
    private JComboBox<String> championList;
    private JButton showGuideButton;
    private JCheckBox assassinsCheckBox;
    private JCheckBox fighterCheckBox;
    private JCheckBox mageCheckBox;
    private JCheckBox marksmanCheckBox;
    private JCheckBox supportCheckBox;
    private JCheckBox tankCheckBox;
    private JLabel generatedChampionName;
    private JButton generateAChampionButton;
    private JPanel randomizerPanel;
    private JLabel generatedChampionImage;


    private final String ICONS_PATH = "src/img/champion/Icons/";

    private final ArrayList<Champion> champions = JSONParser.FromJsonToChampions();
    private ArrayList<Champion> sortedChampions = champions;
    private final ArrayList<String> tags = new ArrayList<>();
    private int newGeneratedChamp;

    private void populateStartingData() {
        championList.setModel(new DefaultComboBoxModel<>(ChampionListToChampionNamesArrayConverter.ChampionNames(sortedChampions)));
    }

    private void initActionListeners() {
        assassinsCheckBox.addActionListener(e -> {
            filterChampionsPerCheckbox(assassinsCheckBox);
        });
        fighterCheckBox.addActionListener(e -> {
            filterChampionsPerCheckbox(fighterCheckBox);
        });
        mageCheckBox.addActionListener(e -> {
            filterChampionsPerCheckbox(mageCheckBox);
        });
        marksmanCheckBox.addActionListener(e -> {
            filterChampionsPerCheckbox(marksmanCheckBox);
        });
        supportCheckBox.addActionListener(e -> {
            filterChampionsPerCheckbox(supportCheckBox);
        });
        tankCheckBox.addActionListener(e -> {
            filterChampionsPerCheckbox(tankCheckBox);
        });

        generateAChampionButton.addActionListener(e -> {
            int randomIndex = randomChampionIndex();
            championList.setSelectedIndex(randomIndex);
            setChampion(randomIndex);
        });
        showGuideButton.addActionListener(e -> {

        });
        championList.addActionListener(e ->{
            setChampion(championList.getSelectedIndex());
        });
    }

    private void setChampion(int championIndex){
        Champion champion = sortedChampions.get(championIndex);
        generatedChampionName.setText(champion.name);
        generatedChampionImage.setIcon(new ImageIcon(ICONS_PATH + champion.image.full));
    }

    private void filterChampionsPerCheckbox(JCheckBox checkBox) {
        if (checkBox.isSelected()) {
            tags.add(checkBox.getText());
        } else {
            tags.remove(checkBox.getText());
        }
        sortedChampions = ChampionsFilter.FilteredChampionsByRole(champions, tags);
        championList.setModel(new DefaultComboBoxModel<>(ChampionListToChampionNamesArrayConverter.ChampionNames(sortedChampions)));

        setChampion(0);
    }

    private int randomChampionIndex() {
        Random random = new Random();
        int tempRandom = random.nextInt(sortedChampions.size());
        while (newGeneratedChamp == tempRandom) {
            tempRandom = random.nextInt(sortedChampions.size());
        }
        newGeneratedChamp = tempRandom;
        return newGeneratedChamp;
    }

    public Randomizer() {
        initActionListeners();
        populateStartingData();
    }

    public static void main(String... args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ignored) {
        }
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

        Randomizer randomizer = new Randomizer();

        JFrame frame = new JFrame("Champion Generator");
        frame.setContentPane(randomizer.randomizerPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(960, 720);
        frame.setResizable(false);
        frame.setLocation(size.width / 2 - randomizer.randomizerPanel.getWidth() / 2, size.height / 2 - randomizer.randomizerPanel.getHeight() / 2);
        frame.setVisible(true);
    }
}
