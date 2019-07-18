package Cherkashin;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class YouTubeTest {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        YouTube youTube = objectMapper.readValue(new File("resources/YouTube.json"), YouTube.class);
        System.out.println("Number of coincidences = " + youTube.pageInfo.totalResults);
        System.out.println();
        singers(youTube);
        System.out.println();
        songs(youTube);
        System.out.println();
        badguyid(youTube);
    }

    private static void singers(YouTube youTube) {
        Set<String> setSingers = new HashSet<>();
        for (Items item : youTube.items) {
            setSingers.add(item.singer.replaceAll("youtube#", ""));
        }
        System.out.println(setSingers);
    }

    private static void songs(YouTube youTube) {
        for (Items item : youTube.items) {
            System.out.println(item.singer.replaceAll("youtube#", "") + " - " + item.id.song);
        }
    }

    private static void badguyid(YouTube youTube) {
        for (Items item : youTube.items) {
            if (item.id.song.contains("Bad Guy")) {
                System.out.println("ID for song \"Bad Guy\" by Billie Eilish: " + item.id.videoId);
            }
        }
    }
}


