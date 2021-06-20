package namegenerator.Helpers;

import com.google.gson.*;
import namegenerator.Models.Champion;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class JSONParser {

    public static ArrayList<Champion> FromJsonToChampions() {
        String championsJSON = null;
        try {
            championsJSON = new String(Files.readAllBytes(Paths.get("champion.json")));
            Gson gson = new Gson();
            ArrayList<Champion> champions = new ArrayList<>();
            JsonObject wholeJson = gson.fromJson(championsJSON, JsonObject.class);
            JsonObject data = gson.fromJson(wholeJson.get("data"), JsonObject.class);
            var keySet = data.keySet().toArray();

            for (Object o : keySet) {
                champions.add(gson.fromJson(data.get(o.toString()), Champion.class));
            }
            return champions;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Dictionary<String, String> FromJsonToChampionGuideLinks() {
        String championsGuideJSON;
        try {
            championsGuideJSON = new String(Files.readAllBytes(Paths.get("championGuides.json")));
            Gson gson = new Gson();
            Dictionary<String, String> championGuides = new Hashtable<>();
            JsonObject wholeJson = gson.fromJson(championsGuideJSON, JsonObject.class);
            championGuides = gson.fromJson(wholeJson.get("data"), Hashtable.class);
            return championGuides;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
