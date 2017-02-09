package namegenerator;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class ChampionsTwo {

    JLabel label;
    JComboBox comboBox;
    ImageIcon ii1;
    Desktop dt = Desktop.getDesktop();

    public void setIconsFromComboBox() {
        switch (comboBox.getSelectedIndex()) {
            case 0:
                ii1 = new ImageIcon(getClass().getResource("/icons/Aatrox_Square_0.png"));
                break;
            case 1:
                ii1 = new ImageIcon(getClass().getResource("/icons/Ahri_Square_0.png"));
                break;
            case 2:
                ii1 = new ImageIcon(getClass().getResource("/icons/Akali_Square_0.png"));
                break;
            case 3:
                ii1 = new ImageIcon(getClass().getResource("/icons/Alistar_Square_0.png"));
                break;
            case 4:
                ii1 = new ImageIcon(getClass().getResource("/icons/Amumu_Square_0.png"));
                break;
            case 5:
                ii1 = new ImageIcon(getClass().getResource("/icons/Anivia_Square_0.png"));
                break;
            case 6:
                ii1 = new ImageIcon(getClass().getResource("/icons/Annie_Square_0.png"));
                break;
            case 7:
                ii1 = new ImageIcon(getClass().getResource("/icons/Ashe_Square_0.png"));
                break;
            case 8:
                ii1 = new ImageIcon(getClass().getResource("/icons/AurelionSol_Square_0.png"));
                break;
            case 9:
                ii1 = new ImageIcon(getClass().getResource("/icons/Azir_Square_0.png"));
                break;
            case 10:
                ii1 = new ImageIcon(getClass().getResource("/icons/Bard_Square_0.png"));
                break;
            case 11:
                ii1 = new ImageIcon(getClass().getResource("/icons/Blitzcrank_Square_0.png"));
                break;
            case 12:
                ii1 = new ImageIcon(getClass().getResource("/icons/Brand_Square_0.png"));
                break;
            case 13:
                ii1 = new ImageIcon(getClass().getResource("/icons/Braum_Square_0.png"));
                break;
            case 14:
                ii1 = new ImageIcon(getClass().getResource("/icons/Caitlyn_Square_0.png"));
                break;
            case 15:
                ii1 = new ImageIcon(getClass().getResource("/icons/Cassiopeia_Square_0.png"));
                break;
            case 16:
                ii1 = new ImageIcon(getClass().getResource("/icons/Chogath_Square_0.png"));
                break;
            case 17:
                ii1 = new ImageIcon(getClass().getResource("/icons/Corki_Square_0.png"));
                break;
            case 18:
                ii1 = new ImageIcon(getClass().getResource("/icons/Darius_Square_0.png"));
                break;
            case 19:
                ii1 = new ImageIcon(getClass().getResource("/icons/Diana_Square_0.png"));
                break;
            case 20:
                ii1 = new ImageIcon(getClass().getResource("/icons/DrMundo_Square_0.png"));
                break;
            case 21:
                ii1 = new ImageIcon(getClass().getResource("/icons/Draven_Square_0.png"));
                break;
            case 22:
                ii1 = new ImageIcon(getClass().getResource("/icons/Ekko_Square_0.png"));
                break;
            case 23:
                ii1 = new ImageIcon(getClass().getResource("/icons/Elise_Square_0.png"));
                break;
            case 24:
                ii1 = new ImageIcon(getClass().getResource("/icons/Evelynn_Square_0.png"));
                break;
            case 25:
                ii1 = new ImageIcon(getClass().getResource("/icons/Ezreal_Square_0.png"));
                break;
            case 26:
                ii1 = new ImageIcon(getClass().getResource("/icons/Fiddlesticks_Square_0.png"));
                break;
            case 27:
                ii1 = new ImageIcon(getClass().getResource("/icons/Fiora_Square_0.png"));
                break;
            case 28:
                ii1 = new ImageIcon(getClass().getResource("/icons/Fizz_Square_0.png"));
                break;
            case 29:
                ii1 = new ImageIcon(getClass().getResource("/icons/Galio_Square_0.png"));
                break;
            case 30:
                ii1 = new ImageIcon(getClass().getResource("/icons/Gangplank_Square_0.png"));
                break;
            case 31:
                ii1 = new ImageIcon(getClass().getResource("/icons/Garen_Square_0.png"));
                break;
            case 32:
                ii1 = new ImageIcon(getClass().getResource("/icons/Gnar_Square_0.png"));
                break;
            case 33:
                ii1 = new ImageIcon(getClass().getResource("/icons/Gragas_Square_0.png"));
                break;
            case 34:
                ii1 = new ImageIcon(getClass().getResource("/icons/Graves_Square_0.png"));
                break;
            case 35:
                ii1 = new ImageIcon(getClass().getResource("/icons/Hecarim_Square_0.png"));
                break;
            case 36:
                ii1 = new ImageIcon(getClass().getResource("/icons/Heimerdinger_Square_0.png"));
                break;
            case 37:
                ii1 = new ImageIcon(getClass().getResource("/icons/Illaoi_Square_0.png"));
                break;
            case 38:
                ii1 = new ImageIcon(getClass().getResource("/icons/Irelia_Square_0.png"));
                break;
            case 39:
                ii1 = new ImageIcon(getClass().getResource("/icons/Ivern_Square_0.png"));
                break;
            case 40:
                ii1 = new ImageIcon(getClass().getResource("/icons/Janna_Square_0.png"));
                break;
            case 41:
                ii1 = new ImageIcon(getClass().getResource("/icons/JarvanIV_Square_0.png"));
                break;
            case 42:
                ii1 = new ImageIcon(getClass().getResource("/icons/Jax_Square_0.png"));
                break;
            case 43:
                ii1 = new ImageIcon(getClass().getResource("/icons/Jayce_Square_0.png"));
                break;
            case 44:
                ii1 = new ImageIcon(getClass().getResource("/icons/Jhin_Square_0.png"));
                break;
            case 45:
                ii1 = new ImageIcon(getClass().getResource("/icons/Jinx_Square_0.png"));
                break;
            case 46:
                ii1 = new ImageIcon(getClass().getResource("/icons/Kalista_Square_0.png"));
                break;
            case 47:
                ii1 = new ImageIcon(getClass().getResource("/icons/Karma_Square_0.png"));
                break;
            case 48:
                ii1 = new ImageIcon(getClass().getResource("/icons/Karthus_Square_0.png"));
                break;
            case 49:
                ii1 = new ImageIcon(getClass().getResource("/icons/Kassadin_Square_0.png"));
                break;
            case 50:
                ii1 = new ImageIcon(getClass().getResource("/icons/Katarina_Square_0.png"));
                break;
            case 51:
                ii1 = new ImageIcon(getClass().getResource("/icons/Kayle_Square_0.png"));
                break;
            case 52:
                ii1 = new ImageIcon(getClass().getResource("/icons/Kennen_Square_0.png"));
                break;
            case 53:
                ii1 = new ImageIcon(getClass().getResource("/icons/Khazix_Square_0.png"));
                break;
            case 54:
                ii1 = new ImageIcon(getClass().getResource("/icons/Kindred_Square_0.png"));
                break;
            case 55:
                ii1 = new ImageIcon(getClass().getResource("/icons/Kled_Square_0.png"));
                break;
            case 56:
                ii1 = new ImageIcon(getClass().getResource("/icons/KogMaw_Square_0.png"));
                break;
            case 57:
                ii1 = new ImageIcon(getClass().getResource("/icons/Leblanc_Square_0.png"));
                break;
            case 58:
                ii1 = new ImageIcon(getClass().getResource("/icons/LeeSin_Square_0.png"));
                break;
            case 59:
                ii1 = new ImageIcon(getClass().getResource("/icons/Leona_Square_0.png"));
                break;
            case 60:
                ii1 = new ImageIcon(getClass().getResource("/icons/Lissandra_Square_0.png"));
                break;
            case 61:
                ii1 = new ImageIcon(getClass().getResource("/icons/Lucian_Square_0.png"));
                break;
            case 62:
                ii1 = new ImageIcon(getClass().getResource("/icons/Lulu_Square_0.png"));
                break;
            case 63:
                ii1 = new ImageIcon(getClass().getResource("/icons/Lux_Square_0.png"));
                break;
            case 64:
                ii1 = new ImageIcon(getClass().getResource("/icons/Malphite_Square_0.png"));
                break;
            case 65:
                ii1 = new ImageIcon(getClass().getResource("/icons/Malzahar_Square_0.png"));
                break;
            case 66:
                ii1 = new ImageIcon(getClass().getResource("/icons/Maokai_Square_0.png"));
                break;
            case 67:
                ii1 = new ImageIcon(getClass().getResource("/icons/MasterYi_Square_0.png"));
                break;
            case 68:
                ii1 = new ImageIcon(getClass().getResource("/icons/MissFortune_Square_0.png"));
                break;
            case 69:
                ii1 = new ImageIcon(getClass().getResource("/icons/MonkeyKing_Square_0.png"));
                break;
            case 70:
                ii1 = new ImageIcon(getClass().getResource("/icons/Mordekaiser_Square_0.png"));
                break;
            case 71:
                ii1 = new ImageIcon(getClass().getResource("/icons/Morgana_Square_0.png"));
                break;
            case 72:
                ii1 = new ImageIcon(getClass().getResource("/icons/Nami_Square_0.png"));
                break;
            case 73:
                ii1 = new ImageIcon(getClass().getResource("/icons/Nasus_Square_0.png"));
                break;
            case 74:
                ii1 = new ImageIcon(getClass().getResource("/icons/Nautilus_Square_0.png"));
                break;
            case 75:
                ii1 = new ImageIcon(getClass().getResource("/icons/Nidalee_Square_0.png"));
                break;
            case 76:
                ii1 = new ImageIcon(getClass().getResource("/icons/Nocturne_Square_0.png"));
                break;
            case 77:
                ii1 = new ImageIcon(getClass().getResource("/icons/Nunu_Square_0.png"));
                break;
            case 78:
                ii1 = new ImageIcon(getClass().getResource("/icons/Olaf_Square_0.png"));
                break;
            case 79:
                ii1 = new ImageIcon(getClass().getResource("/icons/Orianna_Square_0.png"));
                break;
            case 80:
                ii1 = new ImageIcon(getClass().getResource("/icons/Pantheon_Square_0.png"));
                break;
            case 81:
                ii1 = new ImageIcon(getClass().getResource("/icons/Poppy_Square_0.png"));
                break;
            case 82:
                ii1 = new ImageIcon(getClass().getResource("/icons/Quinn_Square_0.png"));
                break;
            case 83:
                ii1 = new ImageIcon(getClass().getResource("/icons/Rammus_Square_0.png"));
                break;
            case 84:
                ii1 = new ImageIcon(getClass().getResource("/icons/RekSai_Square_0.png"));
                break;
            case 85:
                ii1 = new ImageIcon(getClass().getResource("/icons/Renekton_Square_0.png"));
                break;
            case 86:
                ii1 = new ImageIcon(getClass().getResource("/icons/Rengar_Square_0.png"));
                break;
            case 87:
                ii1 = new ImageIcon(getClass().getResource("/icons/Riven_Square_0.png"));
                break;
            case 88:
                ii1 = new ImageIcon(getClass().getResource("/icons/Rumble_Square_0.png"));
                break;
            case 89:
                ii1 = new ImageIcon(getClass().getResource("/icons/Ryze_Square_0.png"));
                break;
            case 90:
                ii1 = new ImageIcon(getClass().getResource("/icons/Sejuani_Square_0.png"));
                break;
            case 91:
                ii1 = new ImageIcon(getClass().getResource("/icons/Shaco_Square_0.png"));
                break;
            case 92:
                ii1 = new ImageIcon(getClass().getResource("/icons/Shen_Square_0.png"));
                break;
            case 93:
                ii1 = new ImageIcon(getClass().getResource("/icons/Shyvana_Square_0.png"));
                break;
            case 94:
                ii1 = new ImageIcon(getClass().getResource("/icons/Singed_Square_0.png"));
                break;
            case 95:
                ii1 = new ImageIcon(getClass().getResource("/icons/Sion_Square_0.png"));
                break;
            case 96:
                ii1 = new ImageIcon(getClass().getResource("/icons/Sivir_Square_0.png"));
                break;
            case 97:
                ii1 = new ImageIcon(getClass().getResource("/icons/Skarner_Square_0.png"));
                break;
            case 98:
                ii1 = new ImageIcon(getClass().getResource("/icons/Sona_Square_0.png"));
                break;
            case 99:
                ii1 = new ImageIcon(getClass().getResource("/icons/Soraka_Square_0.png"));
                break;
            case 100:
                ii1 = new ImageIcon(getClass().getResource("/icons/Swain_Square_0.png"));
                break;
            case 101:
                ii1 = new ImageIcon(getClass().getResource("/icons/Syndra_Square_0.png"));
                break;
            case 102:
                ii1 = new ImageIcon(getClass().getResource("/icons/TahmKench_Square_0.png"));
                break;
            case 103:
                ii1 = new ImageIcon(getClass().getResource("/icons/Taliyah_Square_0.png"));
                break;
            case 104:
                ii1 = new ImageIcon(getClass().getResource("/icons/Talon_Square_0.png"));
                break;
            case 105:
                ii1 = new ImageIcon(getClass().getResource("/icons/Taric_Square_0.png"));
                break;
            case 106:
                ii1 = new ImageIcon(getClass().getResource("/icons/Teemo_Square_0.png"));
                break;
            case 107:
                ii1 = new ImageIcon(getClass().getResource("/icons/Thresh_Square_0.png"));
                break;
            case 108:
                ii1 = new ImageIcon(getClass().getResource("/icons/Tristana_Square_0.png"));
                break;
            case 109:
                ii1 = new ImageIcon(getClass().getResource("/icons/Trundle_Square_0.png"));
                break;
            case 110:
                ii1 = new ImageIcon(getClass().getResource("/icons/Tryndamere_Square_0.png"));
                break;
            case 111:
                ii1 = new ImageIcon(getClass().getResource("/icons/TwistedFate_Square_0.png"));
                break;
            case 112:
                ii1 = new ImageIcon(getClass().getResource("/icons/Twitch_Square_0.png"));
                break;
            case 113:
                ii1 = new ImageIcon(getClass().getResource("/icons/Udyr_Square_0.png"));
                break;
            case 114:
                ii1 = new ImageIcon(getClass().getResource("/icons/Urgot_Square_0.png"));
                break;
            case 115:
                ii1 = new ImageIcon(getClass().getResource("/icons/Varus_Square_0.png"));
                break;
            case 116:
                ii1 = new ImageIcon(getClass().getResource("/icons/Vayne_Square_0.png"));
                break;
            case 117:
                ii1 = new ImageIcon(getClass().getResource("/icons/Veigar_Square_0.png"));
                break;
            case 118:
                ii1 = new ImageIcon(getClass().getResource("/icons/VelKoz_Square_0.png"));
                break;
            case 119:
                ii1 = new ImageIcon(getClass().getResource("/icons/Vi_Square_0.png"));
                break;
            case 120:
                ii1 = new ImageIcon(getClass().getResource("/icons/Viktor_Square_0.png"));
                break;
            case 121:
                ii1 = new ImageIcon(getClass().getResource("/icons/Vladimir_Square_0.png"));
                break;
            case 122:
                ii1 = new ImageIcon(getClass().getResource("/icons/Volibear_Square_0.png"));
                break;
            case 123:
                ii1 = new ImageIcon(getClass().getResource("/icons/Warwick_Square_0.png"));
                break;
            case 124:
                ii1 = new ImageIcon(getClass().getResource("/icons/Xerath_Square_0.png"));
                break;
            case 125:
                ii1 = new ImageIcon(getClass().getResource("/icons/XinZhao_Square_0.png"));
                break;
            case 126:
                ii1 = new ImageIcon(getClass().getResource("/icons/Yasuo_Square_0.png"));
                break;
            case 127:
                ii1 = new ImageIcon(getClass().getResource("/icons/Yorick_Square_0.png"));
                break;
            case 128:
                ii1 = new ImageIcon(getClass().getResource("/icons/Zac_Square_0.png"));
                break;
            case 129:
                ii1 = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));
                break;
            case 130:
                ii1 = new ImageIcon(getClass().getResource("/icons/Ziggs_Square_0.png"));
                break;
            case 131:
                ii1 = new ImageIcon(getClass().getResource("/icons/Zilean_Square_0.png"));
                break;
            case 132:
                ii1 = new ImageIcon(getClass().getResource("/icons/Zyra_Square_0.png"));
                break;
            case 133:
                ii1 = new ImageIcon(getClass().getResource("/icons/Camille_Square_0.png"));
                break;
        }
        label.setIcon(ii1);
    }

    public void setWebGuidesFromComboBox() throws Exception {
        switch (comboBox.getSelectedIndex()) {
            case 0:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/aatrox-guide"));
                break;
            case 1:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/ahri-guide"));
                break;
            case 2:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/akali-guide"));
                break;
            case 3:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/alistar-guide"));
                break;
            case 4:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/amumu-guide"));
                break;
            case 5:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/anivia-guide"));
                break;
            case 6:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/annie-guide"));
                break;
            case 7:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/ashe-guide"));
                break;
            case 8:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/aurelion-sol-guide"));
                break;
            case 9:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/azir-guide"));
                break;
            case 10:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/bard-guide"));
                break;
            case 11:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/blitzcrank-guide"));
                break;
            case 12:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/brand-guide"));
                break;
            case 13:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/braum-guide"));
                break;
            case 14:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/caitlyn-guide"));
                break;
            case 15:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/cassiopeia-guide"));
                break;
            case 16:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/chogath-guide"));
                break;
            case 17:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/corki-guide"));
                break;
            case 18:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/darius-guide"));
                break;
            case 19:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/diana-guide"));
                break;
            case 20:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/dr-mundo-guide"));
                break;
            case 21:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/draven-guide"));
                break;
            case 22:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/ekko-guide"));
                break;
            case 23:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/elise-guide"));
                break;
            case 24:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/evelynn-guide"));
                break;
            case 25:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/ezreal-guide"));
                break;
            case 26:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/fiddlesticks-guide"));
                break;
            case 27:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/fiora-guide"));
                break;
            case 28:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/fizz-guide"));
                break;
            case 29:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/galio-guide"));
                break;
            case 30:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/gangplank-guide"));
                break;
            case 31:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/garen-guide"));
                break;
            case 32:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/gnar-guide"));
                break;
            case 33:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/gragas-guide"));
                break;
            case 34:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/graves-guide"));
                break;
            case 35:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/hecarim-guide"));
                break;
            case 36:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/heimerdinger-guide"));
                break;
            case 37:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/illaoi-guide"));
                break;
            case 38:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/irelia-guide"));
                break;
            case 39:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/ivern-guide"));
                break;
            case 40:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/janna-guide"));
                break;
            case 41:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/jarvan-iv-guide"));
                break;
            case 42:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/jax-guide"));
                break;
            case 43:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/jayce-guide"));
                break;
            case 44:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/jhin-guide"));
                break;
            case 45:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/jinx-guide"));
                break;
            case 46:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/kalista-guide"));
                break;
            case 47:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/karma-guide"));
                break;
            case 48:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/karthus-guide"));
                break;
            case 49:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/kassadin-guide"));
                break;
            case 50:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/katarina-guide"));
                break;
            case 51:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/kayle-guide"));
                break;
            case 52:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/kennen-guide"));
                break;
            case 53:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/khazix-guide"));
                break;
            case 54:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/kindred-guide"));
                break;
            case 55:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/kled-guide"));
                break;
            case 56:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/kogmaw-guide"));
                break;
            case 57:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/leblanc-guide"));
                break;
            case 58:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/lee-sin-guide"));
                break;
            case 59:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/leona-guide"));
                break;
            case 60:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/lissandra-guide"));
                break;
            case 61:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/lucian-guide"));
                break;
            case 62:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/lulu-guide"));
                break;
            case 63:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/lux-guide"));
                break;
            case 64:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/malphite-guide"));
                break;
            case 65:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/malzahar-guide"));
                break;
            case 66:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/maokai-guide"));
                break;
            case 67:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/master-yi-guide"));
                break;
            case 68:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/miss-fortune-guide"));
                break;
            case 69:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/wukong-guide"));
                break;
            case 70:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/mordekaiser-guide"));
                break;
            case 71:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/morgana-guide"));
                break;
            case 72:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/nami-guide"));
                break;
            case 73:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/nasus-guide"));
                break;
            case 74:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/nautilus-guide"));
                break;
            case 75:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/nidalee-guide"));
                break;
            case 76:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/nocturne-guide"));
                break;
            case 77:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/nunu-guide"));
                break;
            case 78:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/olaf-guide"));
                break;
            case 79:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/orianna-guide"));
                break;
            case 80:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/pantheon-guide"));
                break;
            case 81:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/poppy-guide"));
                break;
            case 82:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/quinn-guide"));
                break;
            case 83:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/rammus-guide"));
                break;
            case 84:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/reksai-guide"));
                break;
            case 85:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/renekton-guide"));
                break;
            case 86:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/rengar-guide"));
                break;
            case 87:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/riven-guide"));
                break;
            case 88:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/rumble-guide"));
                break;
            case 89:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/ryze-guide"));
                break;
            case 90:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/sejuani-guide"));
                break;
            case 91:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/shaco-guide"));
                break;
            case 92:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/shen-guide"));
                break;
            case 93:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/shyvana-guide"));
                break;
            case 94:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/singed-guide"));
                break;
            case 95:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/sion-guide"));
                break;
            case 96:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/sivir-guide"));
                break;
            case 97:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/skarner-guide"));
                break;
            case 98:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/sona-guide"));
                break;
            case 99:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/soraka-guide"));
                break;
            case 100:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/swain-guide"));
                break;
            case 101:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/syndra-guide"));
                break;
            case 102:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/tahm-kench-guide"));
                break;
            case 103:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/taliyah-guide"));
                break;
            case 104:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/talon-guide"));
                break;
            case 105:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/taric-guide"));
                break;
            case 106:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/teemo-guide"));
                break;
            case 107:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/thresh-guide"));
                break;
            case 108:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/tristana-guide"));
                break;
            case 109:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/trundle-guide"));
                break;
            case 110:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/tryndamere-guide"));
                break;
            case 111:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/twisted-fate-guide"));
                break;
            case 112:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/twitch-guide"));
                break;
            case 113:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/udyr-guide"));
                break;
            case 114:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/urgot-guide"));
                break;
            case 115:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/varus-guide"));
                break;
            case 116:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/vayne-guide"));
                break;
            case 117:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/veigar-guide"));
                break;
            case 118:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/velkoz-guide"));
                break;
            case 119:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/vi-guide"));
                break;
            case 120:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/viktor-guide"));
                break;
            case 121:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/vladimir-guide"));
                break;
            case 122:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/volibear-guide"));
                break;
            case 123:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/warwick-guide"));
                break;
            case 124:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/xerath-guide"));
                break;
            case 125:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/xin-zhao-guide"));
                break;
            case 126:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/yasuo-guide"));
                break;
            case 127:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/yorick-guide"));
                break;
            case 128:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/zac-guide"));
                break;
            case 129:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/zed-guide"));
                break;
            case 130:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/ziggs-guide"));
                break;
            case 131:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/zilean-guide"));
                break;
            case 132:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/zyra-guide"));
                break;
            case 133:
                dt.browse(new URI("http://www.mobafire.com/league-of-legends/camille-guide"));
                break;
            case 134:
                
        }
    }

    ChampionsTwo(JComboBox jcb) {
        this.comboBox = jcb;
    }

    public ChampionsTwo(JComboBox cbx, JLabel lj) {
        this.comboBox = cbx;
        this.label = lj;
    }
}
