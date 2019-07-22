package Nakhanov.DTO;

import java.security.PublicKey;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Helper {

    public static int totalResults(MainJson mainJson){

        return mainJson.pageInfo.totalResults;
    }

    public static void returnSinger(List<Items> mainJson){
        for(Items items : mainJson){
            System.out.println(items.singer.replaceFirst("youtube#", ""));
        }
    }

    public static void returnSingerAndSong(MainJson mainJson) {
        for (Items items : mainJson.items) {
            String singer = items.singer.replaceFirst("youtube#", "");

            String song = items.id.song;

            System.out.println(singer + " - " + song);
        }
    }

    public static String returnBadGuyId(MainJson mainJson){
        for (Items items : mainJson.items){
            if(items.id.song.contains("Bad Guy")){
                return items.id.videoId + " - ID for song " + items.id.song;
            }
        }
        return "Not found";
    }
    public static void compareTime(PageInfo pageInfo){
        String date = pageInfo.data;
        date = date.substring(0, 10);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println(date.equals(simpleDateFormat.format(new Date())));

    }
}
