package Kutsenko.TestYoutube;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class TestJSONParser {

    static Youtube parseJSON(String jsonPath) {
        ObjectMapper objectMapper = new ObjectMapper();
        File json = null;
        Youtube yt = null;
        try{
            json = new File(jsonPath);
            yt = objectMapper.readValue(json, Youtube.class);
        } catch (Exception e) {
            System.out.println(e);
        }
        return yt;
    }

    static int returnTotalResult(PageInfo pageInfo) {
        return pageInfo.totalResults;
    }

    static void printSingers(List<Items> items) {
        System.out.println("\nList of singers:");
        for (Items item : items){
            System.out.println(item.singer.substring(8));
        }
    }

    static void printSingerAndSong (List<Items> items) {
        System.out.println();
        System.out.println("List of singers and songs:");
        for (Items item : items){
            Id id = item.id;
            System.out.println("Singer: " + item.singer.substring(8) + " Song " + id.song.replace(" (Official Music Video)", ""));
        }
    }

    static void printVideoIdForBadGuy (List<Items> items) {
        String videoId = null;
        for (Items item : items){
            if (item.id.song.contains("Bad Guy")) {
                videoId = item.id.videoId;
            }
        }
        System.out.println("\nVideoId of song 'Bad Guy': " + videoId);
    }

    public static void main(String[] args) {

        Youtube yt = parseJSON("resources/YouTube.json");

        System.out.println("Number of coincidences =" + returnTotalResult(yt.pageInfo));
        printSingers(yt.items);
        printSingerAndSong(yt.items);
        printVideoIdForBadGuy(yt.items);

    }
}
