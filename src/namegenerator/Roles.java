
package namegenerator;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author falcuun
 */
public class Roles {
    ImageIcon ii;
    JLabel label;
    public static String assassins[] = { "Akali"," Ekko", "Evelynn", "Fizz", "Kassadin", "Katarina"," KhaZix", "LeBlanc", "MasterYi", "Nidalee", "Nocturne", "Rengar", "Shaco", "Talon", "Zed"};
    public static String fighters[] = {"Aatrox", "Camille", "Darius", "Diana", "Dr. Mundo", "Fiora", "Gangplank", "Garen", "Gnar", "Gragas", "Hecarim", "Illaoi", "Irelia", "Jax", "Jayce", "Kayle", "Kled", "Lee Sin", "Wukong", "Mordekaiser", "Nasus", "Olaf", "Pantheon", "Rek'Sai", "Renekton", "Riven", "Rumble", "Shyvana", "Skarner", "Trundle", "Tryndamere", "Udyr", "Vi", "Volibear", "Warwick", "Xin Zhao", "Yasuo", "Yorick"};
    public static String tank[] = {"Alistar","Amumu","Blitzcrank", "Cho'Gath", "Galio","JarvanIV","Leona","Malphite","Maokai","Nautilus","Poppy","Rammus","Sejuani","Shen","Singed","Sion","Zac"};
    public static String mages[] = {"Elise", "Fiddlesticks","Heimerdinger","Karma","Karthus","Kenne","Lissandra","Lux","Malzahar","Morgana","Orianna","Ryze","Swain","Syndra","Taliyah","Twisted Fate","Veigar","Vel'Koz","Viktor","Vladimir","Xerath","Ziggs","Zyra"};
    public static String supports[] = {"Bard","Braum","Ivern","Janna","Lulu","Nami","Nunu","Sona","Soraka","Tahm Kench","Taric","Thresh","Zilean"};
    public static String marksman[] = {"Ashe","Caitlyn","Corki","Draven","Ezreal","Graves","Jhin","Jinx","Kalista","Kindred","Kog'Maw","Lucian","Miss Fortune","Quinn","Sivir","Teemo","Tristana","Twitch","Urgot","Varus","Vayne"};

    /*
    15
    39
    17
    24
    13
    21
    */
    
    public int rA (){return (int) (Math.random() * 15);}
    public int rF (){return (int) (Math.random() * 38);}
    public int rT (){return (int) (Math.random() * 17);}
    public int rM (){return (int) (Math.random() * 24);}
    public int rS (){return (int) (Math.random() * 13);}
    public int rMa(){return (int) (Math.random() * 21);}
    Desktop dt = Desktop.getDesktop();
    
    public void setAssassinsIcons(){
     
        switch(rA()){
        case 0:ii = new ImageIcon(getClass().getResource("/icons/Akali_Square_0.png"));break;
        case 1:ii = new ImageIcon(getClass().getResource("/icons/Ekko_Square_0.png"));break;
        case 2:ii = new ImageIcon(getClass().getResource("/icons/Evelynn_Square_0.png"));break;
        case 3:ii = new ImageIcon(getClass().getResource("/icons/Fizz_Square_0.png"));break;
        case 4:ii = new ImageIcon(getClass().getResource("/icons/Kassadin_Square_0.png"));break;
        case 5:ii = new ImageIcon(getClass().getResource("/icons/Katarina_Square_0.png"));break;
        case 6:ii = new ImageIcon(getClass().getResource("/icons/KhaZix_Square_0.png"));break;
        case 7:ii = new ImageIcon(getClass().getResource("/icons/Leblanc_Square_0.png"));break;
        case 8:ii = new ImageIcon(getClass().getResource("/icons/MasterYi_Square_0.png"));break;
        case 9:ii = new ImageIcon(getClass().getResource("/icons/Nidalee_Square_0.png"));break;
        case 10:ii = new ImageIcon(getClass().getResource("/icons/Nocturne_Square_0.png"));break;
        case 11:ii = new ImageIcon(getClass().getResource("/icons/Rengar_Square_0.png"));break;
        case 12:ii = new ImageIcon(getClass().getResource("/icons/Shaco_Square_0.png"));break;
        case 13:ii = new ImageIcon(getClass().getResource("/icons/Talon_Square_0.png"));break;
        case 14:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
      
    }
        label.setIcon(ii);
    }
    public void setFightersIcons(){
        switch(rF()){
        case 0:ii = new ImageIcon(getClass().getResource("/icons/Aatrox_Square_0.png"));break;
        case 1:ii = new ImageIcon(getClass().getResource("/icons/Camille_Square_0.png"));break;
        case 2:ii = new ImageIcon(getClass().getResource("/icons/Darius_Square_0.png"));break;
        case 3:ii = new ImageIcon(getClass().getResource("/icons/Diana_Square_0.png"));break;
        case 4:ii = new ImageIcon(getClass().getResource("/icons/DrMundo_Square_0.png"));break;
        case 5:ii = new ImageIcon(getClass().getResource("/icons/Fiora_Square_0.png"));break;
        case 6:ii = new ImageIcon(getClass().getResource("/icons/Gangplank_Square_0.png"));break;
        case 7:ii = new ImageIcon(getClass().getResource("/icons/Garen_Square_0.png"));break;
        case 8:ii = new ImageIcon(getClass().getResource("/icons/Gnar_Square_0.png"));break;
        case 9:ii = new ImageIcon(getClass().getResource("/icons/Gragas_Square_0.png"));break;
        case 10:ii = new ImageIcon(getClass().getResource("/icons/Hecarim_Square_0.png"));break;
        case 11:ii = new ImageIcon(getClass().getResource("/icons/Illaoi_Square_0.png"));break;
        case 12:ii = new ImageIcon(getClass().getResource("/icons/Irelia_Square_0.png"));break;
        case 13:ii = new ImageIcon(getClass().getResource("/icons/Jax_Square_0.png"));break;
        case 14:ii = new ImageIcon(getClass().getResource("/icons/Jayce_Square_0.png"));break;
        case 15:ii = new ImageIcon(getClass().getResource("/icons/Kayle_Square_0.png"));break;
        case 16:ii = new ImageIcon(getClass().getResource("/icons/Kled_Square_0.png"));break;
        case 17:ii = new ImageIcon(getClass().getResource("/icons/LeeSin_Square_0.png"));break;
        case 18:ii = new ImageIcon(getClass().getResource("/icons/MonkeyKing_Square_0.png"));break;
        case 19:ii = new ImageIcon(getClass().getResource("/icons/Mordekaiser_Square_0.png"));break;
        case 20:ii = new ImageIcon(getClass().getResource("/icons/Nasus_Square_0.png"));break;
        case 21:ii = new ImageIcon(getClass().getResource("/icons/Olaf_Square_0.png"));break;
        case 22:ii = new ImageIcon(getClass().getResource("/icons/Pantheon_Square_0.png"));break;
        case 23:ii = new ImageIcon(getClass().getResource("/icons/RekSai_Square_0.png"));break;
        case 24:ii = new ImageIcon(getClass().getResource("/icons/Renekton_Square_0.png"));break;
        case 25:ii = new ImageIcon(getClass().getResource("/icons/Riven_Square_0.png"));break;
        case 26:ii = new ImageIcon(getClass().getResource("/icons/Rumble_Square_0.png"));break;
        case 27:ii = new ImageIcon(getClass().getResource("/icons/Shyvana_Square_0.png"));break;
        case 28:ii = new ImageIcon(getClass().getResource("/icons/Skarner_Square_0.png"));break;
        case 29:ii = new ImageIcon(getClass().getResource("/icons/Trundle_Square_0.png"));break;
        case 30:ii = new ImageIcon(getClass().getResource("/icons/Tryndamere_Square_0.png"));break;
        case 31:ii = new ImageIcon(getClass().getResource("/icons/Udyr_Square_0.png"));break;
        case 32:ii = new ImageIcon(getClass().getResource("/icons/Vi_Square_0.png"));break;
        case 33:ii = new ImageIcon(getClass().getResource("/icons/Volibear_Square_0.png"));break;
        case 34:ii = new ImageIcon(getClass().getResource("/icons/Warwick_Square_0.png"));break;
        case 35:ii = new ImageIcon(getClass().getResource("/icons/XinZhao_Square_0.png"));break;
        case 36:ii = new ImageIcon(getClass().getResource("/icons/Yasuo_Square_0.png"));break;
        case 37:ii = new ImageIcon(getClass().getResource("/icons/Yorick_Square_0.png"));break;
    
        }
        label.setIcon(ii);
    }
    public void setTanksIcons(){
        switch(rT()){
        case 0:ii = new ImageIcon(getClass().getResource("/icons/Alistar_Square_0.png"));break;
        case 1:ii = new ImageIcon(getClass().getResource("/icons/Amumu_Square_0.png"));break;
        case 2:ii = new ImageIcon(getClass().getResource("/icons/Blitzcrank_Square_0.png"));break;
        case 3:ii = new ImageIcon(getClass().getResource("/icons/ChoGath_Square_0.png"));break;
        case 4:ii = new ImageIcon(getClass().getResource("/icons/Galio_Square_0.png"));break;
        case 5:ii = new ImageIcon(getClass().getResource("/icons/JarvanIV_Square_0.png"));break;
        case 6:ii = new ImageIcon(getClass().getResource("/icons/Leona_Square_0.png"));break;
        case 7:ii = new ImageIcon(getClass().getResource("/icons/Malphite_Square_0.png"));break;
        case 8:ii = new ImageIcon(getClass().getResource("/icons/Maokai_Square_0.png"));break;
        case 9:ii = new ImageIcon(getClass().getResource("/icons/Nautilus_Square_0.png"));break;
        case 10:ii = new ImageIcon(getClass().getResource("/icons/Poppy_Square_0.png"));break;
        case 11:ii = new ImageIcon(getClass().getResource("/icons/Rammus_Square_0.png"));break;
        case 12:ii = new ImageIcon(getClass().getResource("/icons/Sejuani_Square_0.png"));break;
        case 13:ii = new ImageIcon(getClass().getResource("/icons/Shen_Square_0.png"));break;
        case 14:ii = new ImageIcon(getClass().getResource("/icons/Singed_Square_0.png"));break;
        case 15:ii = new ImageIcon(getClass().getResource("/icons/Sion_Square_0.png"));break;
        case 16:ii = new ImageIcon(getClass().getResource("/icons/Zac_Square_0.png"));break;
        
  
        }
        label.setIcon(ii);
    }
    public void setMagesIcons(){
     switch(rM()){  
        case 0:ii = new ImageIcon(getClass().getResource("/icons/Elise_Square_0.png"));break;
        case 1:ii = new ImageIcon(getClass().getResource("/icons/Fiddlesticks_Square_0.png"));break;
        case 2:ii = new ImageIcon(getClass().getResource("/icons/Heimerdinger_Square_0.png"));break;
        case 3:ii = new ImageIcon(getClass().getResource("/icons/Karma_0.png"));break;
        case 4:ii = new ImageIcon(getClass().getResource("/icons/Karthus_Square_0.png"));break;
        case 5:ii = new ImageIcon(getClass().getResource("/icons/Kennen_Square_0.png"));break;
        case 6:ii = new ImageIcon(getClass().getResource("/icons/Lissandra_Square_0.png"));break;
        case 7:ii = new ImageIcon(getClass().getResource("/icons/Lux_Square_0.png"));break;
        case 8:ii = new ImageIcon(getClass().getResource("/icons/Malzahar_Square_0.png"));break;
        case 9:ii = new ImageIcon(getClass().getResource("/icons/Morgana_Square_0.png"));break;
        case 10:ii = new ImageIcon(getClass().getResource("/icons/Orianna_Square_0.png"));break;
        case 11:ii = new ImageIcon(getClass().getResource("/icons/Ryze_Square_0.png"));break;
        case 12:ii = new ImageIcon(getClass().getResource("/icons/Swain_Square_0.png"));break;
        case 13:ii = new ImageIcon(getClass().getResource("/icons/Syndra_Square_0.png"));break;
        case 14:ii = new ImageIcon(getClass().getResource("/icons/Taliyah_Square_0.png"));break;
        case 15:ii = new ImageIcon(getClass().getResource("/icons/TwistedFate_Square_0.png"));break;
        case 16:ii = new ImageIcon(getClass().getResource("/icons/Veigar_Square_0.png"));break;
        case 17:ii = new ImageIcon(getClass().getResource("/icons/VelKoz_Square_0.png"));break;
        case 18:ii = new ImageIcon(getClass().getResource("/icons/Viktor_Square_0.png"));break;
        case 19:ii = new ImageIcon(getClass().getResource("/icons/Vladimir_Square_0.png"));break;
        case 20:ii = new ImageIcon(getClass().getResource("/icons/Xerath_Square_0.png"));break;
        case 21:ii = new ImageIcon(getClass().getResource("/icons/Ziggs_Square_0.png"));break;
        case 22:ii = new ImageIcon(getClass().getResource("/icons/Zyra_Square_0.png"));break;
   
    }
    label.setIcon(ii);
    }
    public void setSupportsIcons(){
        switch(rS()){
        case 0:ii = new ImageIcon(getClass().getResource("/icons/Bard_Square_0.png"));break;
        case 1:ii = new ImageIcon(getClass().getResource("/icons/Braum_Square_0.png"));break;
        case 2:ii = new ImageIcon(getClass().getResource("/icons/Ivern_Square_0.png"));break;
        case 3:ii = new ImageIcon(getClass().getResource("/icons/Janna_Square_0.png"));break;
        case 4:ii = new ImageIcon(getClass().getResource("/icons/Lulu_Square_0.png"));break;
        case 5:ii = new ImageIcon(getClass().getResource("/icons/Nami_Square_0.png"));break;
        case 6:ii = new ImageIcon(getClass().getResource("/icons/Nunu_Square_0.png"));break;
        case 7:ii = new ImageIcon(getClass().getResource("/icons/Sona_Square_0.png"));break;
        case 8:ii = new ImageIcon(getClass().getResource("/icons/Soraka_Square_0.png"));break;
        case 9:ii = new ImageIcon(getClass().getResource("/icons/TahmKench_Square_0.png"));break;
        case 10:ii = new ImageIcon(getClass().getResource("/icons/Taric_Square_0.png"));break;
        case 11:ii = new ImageIcon(getClass().getResource("/icons/Thresh_Square_0.png"));break;
        case 12:ii = new ImageIcon(getClass().getResource("/icons/Zilean_Square_0.png"));break;
    
        }
        label.setIcon(ii);
    }
    public void setMarksmanIcons(){
        switch(rMa()){
        case 0:ii = new ImageIcon(getClass().getResource("/icons/Ashe_Square_0.png"));break;
        case 1:ii = new ImageIcon(getClass().getResource("/icons/Caitlyn_Square_0.png"));break;
        case 2:ii = new ImageIcon(getClass().getResource("/icons/Corki_Square_0.png"));break;
        case 3:ii = new ImageIcon(getClass().getResource("/icons/Draven_Square_0.png"));break;
        case 4:ii = new ImageIcon(getClass().getResource("/icons/Ezreal_Square_0.png"));break;
        case 5:ii = new ImageIcon(getClass().getResource("/icons/Graves_Square_0.png"));break;
        case 6:ii = new ImageIcon(getClass().getResource("/icons/Jhin_Square_0.png"));break;
        case 7:ii = new ImageIcon(getClass().getResource("/icons/Jinx_Square_0.png"));break;
        case 8:ii = new ImageIcon(getClass().getResource("/icons/Kalista_Square_0.png"));break;
        case 9:ii = new ImageIcon(getClass().getResource("/icons/Kindred_Square_0.png"));break;
        case 10:ii = new ImageIcon(getClass().getResource("/icons/KogMaw_Square_0.png"));break;
        case 11:ii = new ImageIcon(getClass().getResource("/icons/Lucian_Square_0.png"));break;
        case 12:ii = new ImageIcon(getClass().getResource("/icons/MissFortune_Square_0.png"));break;
        case 13:ii = new ImageIcon(getClass().getResource("/icons/Quinn_Square_0.png"));break;
        case 14:ii = new ImageIcon(getClass().getResource("/icons/Sivir_Square_0.png"));break;
        case 15:ii = new ImageIcon(getClass().getResource("/icons/Teemo_Square_0.png"));break;
        case 16:ii = new ImageIcon(getClass().getResource("/icons/Tristana_Square_0.png"));break;
        case 17:ii = new ImageIcon(getClass().getResource("/icons/Twitch_Square_0.png"));break;
        case 18:ii = new ImageIcon(getClass().getResource("/icons/Urgot_Square_0.png"));break;
        case 19:ii = new ImageIcon(getClass().getResource("/icons/Varus_Square_0.png"));break;
        case 20:ii = new ImageIcon(getClass().getResource("/icons/Vayne_Square_0.png"));break;
   
        }
        label.setIcon(ii);
    }
    
    public void opnWebguideAssassins() throws URISyntaxException, IOException{
        switch(rA()){
            case 0: dt.browse(new URI("http://www.mobafire.com/league-of-legends/akali-guide"));break;
            case 1: dt.browse(new URI("http://www.mobafire.com/league-of-legends/ekko-guide"));break;
            case 2: dt.browse(new URI("http://www.mobafire.com/league-of-legends/evelynn-guide"));break;
            case 3: dt.browse(new URI("http://www.mobafire.com/league-of-legends/fizz-guide"));break;
            case 4: dt.browse(new URI("http://www.mobafire.com/league-of-legends/kassadin-guide"));break;
            case 5: dt.browse(new URI("http://www.mobafire.com/league-of-legends/katarina-guide"));break;
            case 6: dt.browse(new URI("http://www.mobafire.com/league-of-legends/kha-zix-guide"));break;
            case 7: dt.browse(new URI("http://www.mobafire.com/league-of-legends/leblanc-guide"));break;
            case 8: dt.browse(new URI("http://www.mobafire.com/league-of-legends/master-yi-guide"));break;
            case 9: dt.browse(new URI("http://www.mobafire.com/league-of-legends/nidalee-guide"));break;
            case 10:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/nocturne-guide"));break;
            case 11:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/rengar-guide"));break;
            case 12:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/shaco-guide"));break;
            case 13:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/talon-guide"));break;
            case 14:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/zed-guide"));break;
            case 15: break;
        }   
    }
    public void openWebGuideFighters() throws URISyntaxException, IOException{
        switch(rF()){
        case 0: dt.browse(new URI("http://www.mobafire.com/league-of-legends/aatrox-guide"));break;
            case 1: dt.browse(new URI("http://www.mobafire.com/league-of-legends/camille-guide"));break;
            case 2: dt.browse(new URI("http://www.mobafire.com/league-of-legends/darius-guide"));break;
            case 3: dt.browse(new URI("http://www.mobafire.com/league-of-legends/diana-guide"));break;
            case 4: dt.browse(new URI("http://www.mobafire.com/league-of-legends/dr-mundo-guide"));break;
            case 5: dt.browse(new URI("http://www.mobafire.com/league-of-legends/fiora-guide"));break;
            case 6: dt.browse(new URI("http://www.mobafire.com/league-of-legends/gangplank-guide"));break;
            case 7: dt.browse(new URI("http://www.mobafire.com/league-of-legends/garen-guide"));break;
            case 8: dt.browse(new URI("http://www.mobafire.com/league-of-legends/gnar-guide"));break;
            case 9: dt.browse(new URI("http://www.mobafire.com/league-of-legends/gragas-guide"));break;
            case 10:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/hecarim-guide"));break;
            case 11:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/illaoi-guide"));break;
            case 12:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/irelia-guide"));break;
            case 13:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/jax-guide"));break;
            case 14:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/jayce-guide"));break;
            case 15:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/kayle-guide"));break;
            case 16:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/kled-guide"));break;
            case 17:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/lee-sin-guide"));break;
            case 18:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/wukong-guide"));break;
            case 19:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/mordekaiser-guide"));break;
            case 20:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/nasus-guide"));break;
            case 21:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/olaf-guide"));break;
            case 22:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/pantheon-guide"));break;
            case 23:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/rek-sai-guide"));break;
            case 24:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/renekton-guide"));break;
            case 25:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/riven-guide"));break;
            case 26:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/rumble-guide"));break;
            case 27:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/shyvana-guide"));break;
            case 28:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/skarner-guide"));break;
            case 29:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/trundle-guide"));break;
            case 30:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/tryndamere-guide"));break;
            case 31:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/udyr-guide"));break;
            case 32:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/vi-guide"));break;
            case 33:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/volibear-guide"));break;
            case 34:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/warwick-guide"));break;
            case 35:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/xin-zhao-guide"));break;
            case 36:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/yasuo-guide"));break;
            case 37:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/yorick-guide"));break;
            case 38: break;
        }
    }
     public void openWebGuideTanks() throws URISyntaxException, IOException{
        switch(rT()){
            case 0: dt.browse(new URI("http://www.mobafire.com/league-of-legends/alistar-guide"));break;
            case 1: dt.browse(new URI("http://www.mobafire.com/league-of-legends/amumu-guide"));break;
            case 2: dt.browse(new URI("http://www.mobafire.com/league-of-legends/blitzcrank-guide"));break;
            case 3: dt.browse(new URI("http://www.mobafire.com/league-of-legends/cho-gath-guide"));break;
            case 4: dt.browse(new URI("http://www.mobafire.com/league-of-legends/galio-guide"));break;
            case 5: dt.browse(new URI("http://www.mobafire.com/league-of-legends/jarvan-iv-guide"));break;
            case 6: dt.browse(new URI("http://www.mobafire.com/league-of-legends/leona-guide"));break;
            case 7: dt.browse(new URI("http://www.mobafire.com/league-of-legends/malphite-guide"));break;
            case 8: dt.browse(new URI("http://www.mobafire.com/league-of-legends/maokai-guide"));break;
            case 9: dt.browse(new URI("http://www.mobafire.com/league-of-legends/nautilus-guide"));break;
            case 10:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/poppy-guide"));break;
            case 11:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/rammus-guide"));break;
            case 12:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/sejuani-guide"));break;
            case 13:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/shen-guide"));break;
            case 14:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/singed-guide"));break;
            case 15:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/sion-guide"));break;
            case 16:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/zac-guide"));break;
            case 17: break;
        }
     }
     public void openWebGuideSupports() throws URISyntaxException, IOException{
        switch(rS()){
            case 0: dt.browse(new URI("http://www.mobafire.com/league-of-legends/bard-guide"));break;
            case 1: dt.browse(new URI("http://www.mobafire.com/league-of-legends/braum-guide"));break;
            case 2:dt.browse(new URI("http://www.mobafire.com/league-of-legends/ivern-guide"));break;
            case 3:dt.browse(new URI("http://www.mobafire.com/league-of-legends/janna-guide"));break;
            case 4:dt.browse(new URI("http://www.mobafire.com/league-of-legends/lulu-guide"));break;
            case 5:dt.browse(new URI("http://www.mobafire.com/league-of-legends/nami-guide"));break;
            case 6:dt.browse(new URI("http://www.mobafire.com/league-of-legends/nunu-guide"));break;
            case 7:dt.browse(new URI("http://www.mobafire.com/league-of-legends/sona-guide"));break;
            case 8:dt.browse(new URI("http://www.mobafire.com/league-of-legends/soraka-guide"));break;
            case 9:dt.browse(new URI("http://www.mobafire.com/league-of-legends/tahm-kench-guide"));break;
            case 10:dt.browse(new URI("http://www.mobafire.com/league-of-legends/taric-guide"));break;
            case 11:dt.browse(new URI("http://www.mobafire.com/league-of-legends/thresh-guide"));break;
            case 12:dt.browse(new URI("http://www.mobafire.com/league-of-legends/zilean-guide"));break;
            case 13:break;
            case 14:
        }
    }
     public void openWebGuideMages() throws URISyntaxException, IOException{
        switch(rM()){
            case 0: dt.browse(new URI("http://www.mobafire.com/league-of-legends/ahri-guide"));break;
            case 1: dt.browse(new URI("http://www.mobafire.com/league-of-legends/anivia-guide"));break;
            case 2: dt.browse(new URI("http://www.mobafire.com/league-of-legends/annie-guide"));break;
            case 3: dt.browse(new URI("http://www.mobafire.com/league-of-legends/aurolion-sol-guide"));break;
            case 4: dt.browse(new URI("http://www.mobafire.com/league-of-legends/azir-guide"));break;
            case 5: dt.browse(new URI("http://www.mobafire.com/league-of-legends/brand-guide"));break;
            case 6: dt.browse(new URI("http://www.mobafire.com/league-of-legends/cassiopeia-guide"));break;
            case 7: dt.browse(new URI("http://www.mobafire.com/league-of-legends/elise-guide"));break;
            case 8: dt.browse(new URI("http://www.mobafire.com/league-of-legends/fiddlesticks-guide"));break;
            case 9: dt.browse(new URI("http://www.mobafire.com/league-of-legends/heimerdinger-guide"));break;
            case 10:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/karma-guide"));break;
            case 11:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/karthus-guide"));break;
            case 12:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/kennen-guide"));break;
            case 13:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/lissandra-guide"));break;
            case 14:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/lux-guide"));break;
            case 15:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/malzahar-guide"));break;
            case 16:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/morgana-guide"));break;
            case 17:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/orianna-guide"));break;
            case 18:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/ryze-guide"));break;
            case 19:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/swain-guide"));break;
            case 20:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/syndra-guide"));break;
            case 21:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/taliyah-guide"));break;
            case 22:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/twisted-fate-guide"));break;
            case 23:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/veigar-guide"));break;
            case 24:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/vel-koz-guide"));break;
            case 25:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/viktor-guide"));break;
            case 26:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/vladimir-guide"));break;
            case 27:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/xerath-guide"));break;
            case 28:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/ziggs-guide"));break;
            case 29:    dt.browse(new URI("http://www.mobafire.com/league-of-legends/zyra-guide"));break;
            case 30:   break;
        }
    }
      public void openWebGuideMarksman() throws URISyntaxException, IOException{
        switch(rMa()){
            case 0:dt.browse(new URI("http://www.mobafire.com/league-of-legends/ahse-guide"));break;
            case 1:dt.browse(new URI("http://www.mobafire.com/league-of-legends/caitlyn-guide"));break;
            case 2:dt.browse(new URI("http://www.mobafire.com/league-of-legends/corki-guide"));break;
            case 3:dt.browse(new URI("http://www.mobafire.com/league-of-legends/draven-guide"));break;
            case 4:dt.browse(new URI("http://www.mobafire.com/league-of-legends/ezreal-guide"));break;
            case 5:dt.browse(new URI("http://www.mobafire.com/league-of-legends/graves-guide"));break;
            case 6:dt.browse(new URI("http://www.mobafire.com/league-of-legends/jhin-guide"));break;
            case 7:dt.browse(new URI("http://www.mobafire.com/league-of-legends/jinx-guide"));break;
            case 8:dt.browse(new URI("http://www.mobafire.com/league-of-legends/kalista-guide"));break;
            case 9:dt.browse(new URI("http://www.mobafire.com/league-of-legends/kindred-guide"));break;
            case 10:dt.browse(new URI("http://www.mobafire.com/league-of-legends/kog-maw-guide"));break;
            case 11:dt.browse(new URI("http://www.mobafire.com/league-of-legends/lucian-guide"));break;
            case 12:dt.browse(new URI("http://www.mobafire.com/league-of-legends/miss-fortune-guide"));break;
            case 13:dt.browse(new URI("http://www.mobafire.com/league-of-legends/quinn-guide"));break;
            case 14:dt.browse(new URI("http://www.mobafire.com/league-of-legends/sivir-guide"));break;
            case 15:dt.browse(new URI("http://www.mobafire.com/league-of-legends/teemo-guide"));break;
            case 16:dt.browse(new URI("http://www.mobafire.com/league-of-legends/tristana-guide"));break;
            case 17:dt.browse(new URI("http://www.mobafire.com/league-of-legends/twitch-guide"));break;
            case 18:dt.browse(new URI("http://www.mobafire.com/league-of-legends/urgot-guide"));break;
            case 19:dt.browse(new URI("http://www.mobafire.com/league-of-legends/varus-guide"));break;
            case 20:dt.browse(new URI("http://www.mobafire.com/league-of-legends/vayne-guide"));break;
            case 21: break;
        }
    }
      
    public String getAssassins(){
        return assassins[rA()];
    }
    public String getFighters(){
        return fighters[rF()];
    }
    public String getTanks(){
        return tank[rT()];
    }
    public String getMages(){
        return mages[rM()];
    }
    public String getSupports(){
        return supports[rS()];
    }
    public String getMarksman(){
        return marksman[rMa()];
    }
    
    public Roles(JLabel la){
        this.label = la;
    }
}

