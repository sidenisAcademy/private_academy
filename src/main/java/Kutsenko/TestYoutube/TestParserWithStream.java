package Kutsenko.TestYoutube;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static org.codehaus.groovy.runtime.DefaultGroovyMethods.collect;

public class TestParserWithStream {

    static Youtube parseJSON(String jsonPath) {
        ObjectMapper objectMapper = new ObjectMapper();
        File json = null;
        Youtube yt = null;
        try {
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
        items.stream()
                .map(x -> x.singer.substring(8))
                .forEach(System.out::println);
    }

    static void printSingerAndSong(List<Items> items) {
        System.out.println("\nList of singers and songs:");
        items.stream()
                .map(x ->
                        "Singer: " + x.singer.substring(8) +
                                " Song: " + x.id.song.replace(" (Official Music Video)", ""))
                .forEach(System.out::println);
    }

    static String printVideoIdForBadGuy(List<Items> items) {
        return items.stream()
                .filter(item -> item.id.song.contains("Bad Guy"))
                .map(item -> item.id.videoId)
                .findFirst()
                .orElse("No song Bad Guy");
    }

    public static void main(String[] args) {

        Youtube yt = parseJSON("resources/YouTube.json");

        System.out.println("Number of coincidences =" + returnTotalResult(yt.pageInfo));
        printSingers(yt.items);
        printSingerAndSong(yt.items);
        System.out.println("\nVideoId of song 'Bad Guy': " + printVideoIdForBadGuy(yt.items));

    }

}
