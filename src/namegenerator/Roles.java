
package namegenerator;

import javax.swing.ImageIcon;

/**
 *
 * @author falcuun
 */
public class Roles {
    ImageIcon ii;
    public static String assassins[] = { "Akali"," Ekko", "Evelynn", "Fizz", "Kassadin", "Katarina"," KhaZix", "LeBlanc", "MasterYi", "Nidalee", "Nocturne", "Rengar", "Shaco", "Talon", "Zed","Select Champion..."};
    public static String fighters[] = {"Aatrox", "Camille", "Darius", "Diana", "Dr. Mundo", "Fiora", "Gangplank", "Garen", "Gnar", "Gragas", "Hecarim", "Illaoi", "Irelia", "Jax", "Jayce", "Kayle", "Kled", "Lee Sin", "Mordekaiser", "Nasus", "Olaf", "Pantheon", "Rek'Sai", "Renekton", "Riven", "Rumble", "Shyvana", "Skarner", "Trundle", "Tryndamere", "Udyr", "Vi", "Volibear", "Warwick", "Wukong", "Xin Zhao", "Yasuo", "Yorick","Select Champion..."};
    public static String tank[] = {"Alistar","Amumu","Blitzcrank", "Cho'Gath", "Galio","JarvanIV","Leona","Malphite","Maokai","Nautilus","Poppy","Rammus","Sejuani","Shen","Singed","Sion","Zac","Select Champion..."};
    public static String mages[] = {"Elise", "Fiddlesticks","Heimerdinger","Karma","Karthus","Kenne","Lissandra","Lux","Malzahar","Morgana","Orianna","Ryze","Swain","Syndra","Taliyah","Twisted Fate","Veigar","Vel'Koz","Viktor","Vladimir","Xerath","Ziggs","Zyra","Select Champion..."};
    public static String supports[] = {"Bard","Braum","Ivern","Janna","Lulu","Nami","Nunu","Sona","Soraka","Tahm Kench","Taric","Thresh","Zelian","Select Champion..."};
    public static String marksman[] = {"Ashe","Caitlyn","Corki","Draven","Ezreal","Graves","Jhin","Jinx","Kalista","Kindred","Kog'Maw","Lucian","Miss Fortune","Quinn","Sivir","Teemo","Tristana","Twitch","Urgot","Varus","Vayne","Select Champion..."};

    /*
    15
    39
    17
    24
    13
    21
    */
    
    public int rA = (int) (Math.random() * 16);
    public int rF = (int) (Math.random() * 39);
    public int rT = (int) (Math.random() * 18);
    public int rM = (int) (Math.random() * 25);
    public int rS = (int) (Math.random() * 14);
    public int rMa = (int) (Math.random() * 22);
    
    public void setAssassinsIcons(){
     
        switch(rA){
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
        case 15:break;
    }}
    public void setFightersIcons(){
        switch(rF){
        case 1:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 2:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 3:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 4:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 5:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 6:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 7:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 8:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 9:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 10:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 11:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 12:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 13:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 14:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 15:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 16:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 17:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 18:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 19:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 20:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 21:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 22:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 23:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 24:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 25:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 26:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 27:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 28:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 29:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 30:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 31:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 32:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 33:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 34:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 35:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 36:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 37:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 38:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 39:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        }
    }
    public void setTanksIcons(){
        switch(rT){
        case 0:ii = new ImageIcon(getClass().getResource("/icons/Alistar_Square_0.png"));break;
        case 1:ii = new ImageIcon(getClass().getResource("/icons/Amumu_Square_0.png"));break;
        case 2:ii = new ImageIcon(getClass().getResource("/icons/Blitzcrank_Square_0.png"));break;
        case 3:ii = new ImageIcon(getClass().getResource("/icons/ChoGath_Square_0.png"));break;
        case 4:ii = new ImageIcon(getClass().getResource("/icons/Galio_Square_0.png"));break;
        case 5:ii = new ImageIcon(getClass().getResource("/icons/JarvanIV_Square_0.png"));break;
        case 6:ii = new ImageIcon(getClass().getResource("/icons/Leona_Square_0.png"));break;
        case 7:ii = new ImageIcon(getClass().getResource("/icons/Malphite_Square_0.png"));break;
        case 8:ii = new ImageIcon(getClass().getResource("/icons/Nautilus_Square_0.png"));break;
        case 9:ii = new ImageIcon(getClass().getResource("/icons/Poppy_Square_0.png"));break;
        case 10:ii = new ImageIcon(getClass().getResource("/icons/Rammus_Square_0.png"));break;
        case 11:ii = new ImageIcon(getClass().getResource("/icons/Sejuani_Square_0.png"));break;
        case 12:ii = new ImageIcon(getClass().getResource("/icons/Shen_Square_0.png"));break;
        case 13:ii = new ImageIcon(getClass().getResource("/icons/Singed_Square_0.png"));break;
        case 14:ii = new ImageIcon(getClass().getResource("/icons/Sion_Square_0.png"));break;
        case 15:ii = new ImageIcon(getClass().getResource("/icons/Zac_Square_0.png"));break;
        case 16:ii = new ImageIcon(getClass().getResource("/icons/Zed_Square_0.png"));break;
        case 17:break;
        }
    }
    public void setMagesIcons(){
     switch(rM){  
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
        case 23: break;
    }}
    public void setSupportsIcons(){
        switch(rS){
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
        case 13:break;
        }
    }
    public void setMarksmanIcons(){
        switch(rMa){
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
        case 21:break;
        }
    }
    
    
    public String[] getAssassins(){
        return assassins;
    }
    public String[] getFighters(){
        return fighters;
    }
    public String[] getTanks(){
        return tank;
    }
    public String[] getMages(){
        return mages;
    }
    public String[] gsetSupports(){
        return supports;
    }
    public String[] getMarksman(){
        return marksman;
    }
}

