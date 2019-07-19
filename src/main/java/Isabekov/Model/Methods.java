package Isabekov.Model;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;


public class Methods {
    public void calcResults(DTO1 youTubeResponse) {
        System.out.println("Number of coincidences = " + youTubeResponse.pageInfo.totalResults);
    }

    public void printSingers(DTO1 youTubeResponse) {
        for (Items item : youTubeResponse.items)
            System.out.println(item.singer.replaceAll("youtube#", ""));
    }

    public void printSingerNameAndSong(DTO1 youTubeResponse) {
        for (Items item : youTubeResponse.items)
            System.out.println(item.singer.replaceAll("youtube#", "") + " - " + item.id.song);
    }

    public void getVideoId(DTO1 youTubeResponse) {
        for (Items item : youTubeResponse.items) {
            if (item.id.song.contains("Bad Guy"))
                System.out.println("Bad Guy video ID is " + item.id.videoId);
        }
    }

    public void compareDates(DTO1 youTubeResponse) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String substring = youTubeResponse.pageInfo.data.substring(0, 10);

        Date date = sdf.parse(substring);
        LocalDate todayDate = LocalDate.now();
        Date today = java.sql.Date.valueOf(todayDate);
        System.out.println(sdf.format(date));
        System.out.println(todayDate);

        if (date.compareTo(today) > 0)
            System.out.println("Today is less");
        else if (date.compareTo(today) < 0)
            System.out.println("Today is more");
        else if (date.compareTo(today) == 0)
            System.out.println("Days are equal");

    }
}