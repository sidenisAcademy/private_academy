package Isabekov.YouTubeParsing;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;


public class Methods {

    public void calcResults(MyDto DTO1) {
        System.out.println("Number of coincidences = " + DTO1.pageInfo.totalResults);
    }

    // новое задание
    public void printSingers(MyDto DTO1) {
        System.out.println("Stream ");
        DTO1.items.stream()
                .map(item -> item.singer.replaceAll("youtube#", "") + " - " + item.id.song).forEach(System.out::println);


        System.out.println("FOR ");
        for (Items item : DTO1.items)
            System.out.println(item.singer.replaceAll("youtube#", ""));
    }

    //старое задание
//    public void printSingers(MyDto DTO1) {
//        for (Items item : DTO1.items)
//            System.out.println(item.singer.replaceAll("youtube#", ""));
//    }


    public void printSingerNameAndSong(MyDto DTO1) {
        for (Items item : DTO1.items)
            System.out.println(item.singer.replaceAll("youtube#", "") + " - " + item.id.song);
    }

// новое задание
    public void getVideoId(MyDto DTO1) {
        System.out.println("Stream videoID ");
        DTO1.items.stream()
                .filter(items -> items.id.song.contains("Bad Guy"))  // filder = if
                .map(item -> "Bad Guy video ID is " + item.id.videoId).forEach(System.out::println);
}
//    public void getVideoId(MyDto DTO1) {
//        for (Items item : DTO1.items) {
//            if (item.id.song.contains("Bad Guy"))
//                System.out.println("Bad Guy video ID is " + item.id.videoId);
//        }
//    }

    public void compareDates(MyDto DTO1) throws Exception  {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String substring = DTO1.pageInfo.data.substring(0, 10);

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
