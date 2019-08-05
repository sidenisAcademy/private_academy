package Nakhanov.DTO;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Helper {

    public static int totalResults(MainJson mainJson) {

        return mainJson.pageInfo.totalResults;
    }

    public static void returnSinger(List<Items> mainJson) {

        mainJson.stream()
                .map(items -> items.singer)
                .forEach(x -> System.out.println(x.replaceFirst("youtube#", "")));

        for (Items items : mainJson) {
            System.out.println(items.singer.replaceFirst("youtube#", ""));
        }
    }

    public static void returnSingerAndSong(MainJson mainJson) {

        mainJson.items.stream()
                .peek(items1 -> System.out.println(items1.singer.replaceFirst("youtube#", "")))
                .map(x -> x.id)
                .forEach(x -> System.out.println(x.song));

        mainJson.items.forEach(items ->
                System.out.println(items.singer + (items.id.videoId))
        );

    }

    public static String returnBadGuyId(MainJson mainJson) {
        for (Items items : mainJson.items) {
            if (items.id.song.contains("Bad Guy")) {
                return items.id.videoId + " - ID for song " + items.id.song;
            }
        }
        return "Not found";
    }

    public static String returnBadGuyIdUsingStreams(MainJson mainJson) {

        return mainJson.items.stream()
                .filter(x -> x.id.song.contains("Bad Guy"))
                .map(x -> x.id.videoId)
                .findFirst()
                .orElse("No found");
    }

    public static void compareTime(PageInfo pageInfo) {
        String date = pageInfo.data;
        date = date.substring(0, 10);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println(date.equals(simpleDateFormat.format(new Date())));

    }
}
