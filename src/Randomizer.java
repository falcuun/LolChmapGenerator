import namegenerator.JSONParser;
import namegenerator.Models.Champion;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Randomizer extends JFrame {
    private JComboBox comboBox1;
    private JButton showGuideButton;
    private JCheckBox assassinsCheckBox;
    private JCheckBox fightersCheckBox;
    private JCheckBox magesCheckBox;
    private JCheckBox marksmanCheckBox;
    private JCheckBox supportsCheckBox;
    private JCheckBox tanksCheckBox;
    private JLabel generatedChampionName;
    private JButton generateAChampionButton;
    private JPanel randomizerPanel;
    private JLabel generatedChampionImage;


    private String ICONS_PATH = "src/img/champion/Icons/";

    ArrayList<Champion> champions = JSONParser.FromJsonToChampions();
    ArrayList<Champion> sortedChampions;

    public Randomizer() {
        generateAChampionButton.addActionListener(e -> {
            generatedChampionName.setText(champions.get(5).name);
            generatedChampionImage.setIcon(new ImageIcon(ICONS_PATH+champions.get(5).image.full));
        });
        showGuideButton.addActionListener(e -> {

        });
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
