package Cherkashin;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class YouTubeTestWithStreams {

    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        YouTube youTube = objectMapper.readValue(new File("resources/YouTube.json"), YouTube.class);
//        System.out.println("Number of coincidences = " + youTube.pageInfo.totalResults);
//        System.out.println();
//        singers(youTube);
        System.out.println("first task: ");
        singers2(youTube);
//        System.out.println();
//        songs(youTube);
        System.out.println("second task: ");
        songs2(youTube);
//        System.out.println();
//        badguyid(youTube);
        System.out.println("third task: ");
        System.out.println(badguy2(youTube));
    }

//    private static void singers(YouTube youTube) {
//        Set<String> setSingers = new HashSet<>();
//        for (Items item : youTube.items) {
//            setSingers.add(item.singer.replaceAll("youtube#", ""));
//        }
//        System.out.println(setSingers);
//    }

    private static void singers2(YouTube youTube) {
        Set<String> setSingers2 =
                youTube.items.stream()
                        .map(Items -> Items.singer.replaceAll("youtube#", ""))
                        .collect(toSet());
        setSingers2.forEach(System.out::println);
    }

//    private static void songs(YouTube youTube) {
//        for (Items item : youTube.items) {
//            System.out.println(item.singer.replaceAll("youtube#", "") + " - " + item.id.song);
//        }
//    }

    private static void songs2(YouTube youTube) {
        List<String> songs2 =
                youTube.items.stream()
                        .map(Items -> Items.singer.replaceAll("youtube#", "") + " - " + Items.id.song)
                        .collect(toList());
        songs2.forEach(System.out::println);
//
//    private static void badguyid(YouTube youTube) {
//        for (Items item : youTube.items) {
//            if (item.id.song.contains("Bad Guy")) {
//                System.out.println("ID for song \"Bad Guy\" by Billie Eilish: " + item.id.videoId);
//            }
//        }
//
    }

    private static String badguy2(YouTube youTube) {
        return youTube.items.stream()
                .filter(Items -> Items.id.song.contains("Bad Guy"))
                .map(Items -> Items.id.videoId)
                .findAny()
                .orElse("Not found");
    }
}
