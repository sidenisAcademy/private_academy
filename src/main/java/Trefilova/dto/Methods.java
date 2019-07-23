package Trefilova.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Methods {
    public void calcResults(YouTubeResponse youTubeResponse) {
        System.out.println("Number of coincidences = " + youTubeResponse.pageInfo.totalResults);
    }

    public void printSingers(YouTubeResponse youTubeResponse) {
        for (Items item : youTubeResponse.items)
            System.out.println(item.singer.replaceAll("youtube#", ""));
    }

    public void printSingerNameAndSong(YouTubeResponse youTubeResponse) {
        for (Items item : youTubeResponse.items)
            System.out.println(item.singer.replaceAll("youtube#", "") + " - " + item.id.song);
    }

    public void getVideoId(YouTubeResponse youTubeResponse) {
        for (Items item : youTubeResponse.items) {
            if(item.id.song.contains("Bad Guy"))
                System.out.println("Bad Guy video ID is " + item.id.videoId);
        }
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
