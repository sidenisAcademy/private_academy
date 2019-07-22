package Gaisenok.dto;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonParsing {
    static ObjectMapper objectMapper = new ObjectMapper();
    static final String jsonFileName = "resources/YouTube.json";
    public static JsonStruct jsonReader(String jsonFileName) {

        JsonStruct myJson = new JsonStruct();

        try {
            myJson =
                    objectMapper.readValue(new File(jsonFileName), JsonStruct.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return myJson;
    }
    public static void searchResult(JsonStruct myJson) {
            System.out.println("Number of coincidences = " + myJson.pageInfo.totalResults);
    }

    public static void printSingers(JsonStruct myJson) {
        System.out.println("List of singers: ");
        for (Items item : myJson.items) {
            System.out.println(item.getSinger().split("#")[1]);
        }
    }
        public static void printSingersAndSongs (JsonStruct myJson){
            System.out.println("List of singers with songs: ");
            for (Items item : myJson.items) {
                System.out.println("Singer: " + item.getSinger().split("#")[1] + " with a song: " + item.getId().getSong());
            }
        }

        public static void printVideoId (JsonStruct myJson){

            for (Items item : myJson.items) {
                if (item.getId().getSong().contains("Bad Guy"))
                    System.out.println("VideoId for a song " + item.getId().getSong() + " is " + item.getId().videoId);
            }
        }

    public static void main(String[] arg) {

        searchResult(jsonReader(jsonFileName));
        printSingers(jsonReader(jsonFileName));
        printSingersAndSongs(jsonReader(jsonFileName));
        printVideoId(jsonReader(jsonFileName));
    }
}