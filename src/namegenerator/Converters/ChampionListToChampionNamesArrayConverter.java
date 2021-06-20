package namegenerator.Converters;

import namegenerator.Models.Champion;

import java.util.List;

public class ChampionListToChampionNamesArrayConverter {

    public static String[] ChampionNames(List<Champion> champions){
        String[] championNames = new String[champions.size()];
        for(int i = 0; i < champions.size(); ++i){
            championNames[i] = champions.get(i).name;
        }
        return championNames;
    }
}
