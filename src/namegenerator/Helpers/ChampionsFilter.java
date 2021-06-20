package namegenerator.Helpers;

import namegenerator.Models.Champion;

import java.util.ArrayList;
import java.util.List;

public class ChampionsFilter {


    public static ArrayList<Champion> FilteredChampionsByRole(List<Champion> inputList, List<String> tags){
        ArrayList<Champion> filteredList = new ArrayList<>();

        for (Champion champion : inputList) {
            if (champion.tags.containsAll(tags)) {
                filteredList.add(champion);
            }
        }

        return filteredList;
    }
}
