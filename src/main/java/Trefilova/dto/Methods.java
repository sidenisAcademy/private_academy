package Trefilova.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Methods {
    public void calcResults(YouTubeResponse youTubeResponse) {
        System.out.println("Number of coincidences = " + youTubeResponse.pageInfo.totalResults);
    }

    public void printSingers(YouTubeResponse youTubeResponse) {
//        for (Items item : youTubeResponse.items)
//            System.out.println(item.singer.replaceAll("youtube#", ""));

       Set<String> temp = youTubeResponse.items.stream()
                .map(s -> s.singer.replaceAll("youtube#", ""))
                .collect(Collectors.toSet());
       temp.forEach(System.out::println);
    }


    public void printSingerNameAndSong(YouTubeResponse youTubeResponse) {
//        for (Items item : youTubeResponse.items)
//            System.out.println(item.singer.replaceAll("youtube#", "") + " - " + item.id.song);

        youTubeResponse.items.stream()
                .map(item -> item.singer.replaceAll("youtube#", "") + " - " + item.id.song)
                .forEach(System.out::println);

        Map<String, String> temp = youTubeResponse.items.stream()
                .collect(Collectors.toMap(x -> x.id.song, x -> x.singer.replaceAll("youtube#", "")));
        temp.forEach((k,v) -> System.out.println(v + " " + k));
    }

    public String getVideoId(YouTubeResponse youTubeResponse) {
//        for (Items item : youTubeResponse.items) {
//            if(item.id.song.contains("Bad Guy"))
//                System.out.println("Bad Guy video ID is " + item.id.videoId);
//        }

        Optional<String> temp = youTubeResponse.items.stream()
                .filter(s -> s.id.song.contains("Bad Guy")).
                map(x -> x.id.videoId).findFirst();
                //.forEach(s -> System.out.println("Bad Guy video ID is " + s.id.videoId));
        return temp.toString();
    }

    public void compareDates(YouTubeResponse youTubeResponse) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String substring = youTubeResponse.pageInfo.data.substring(0, 10);

        Date date = sdf.parse(substring);
        LocalDate todayDate = LocalDate.now();
        Date today = java.sql.Date.valueOf(todayDate);
        System.out.println(sdf.format(date));
        System.out.println(todayDate);

        if(date.compareTo(today) > 0)
            System.out.println("Today is less");
        else if(date.compareTo(today) < 0)
            System.out.println("Today is more");
        else if(date.compareTo(today) == 0)
            System.out.println("Days are equal");

        //System.out.println(today - date);
    }
}
