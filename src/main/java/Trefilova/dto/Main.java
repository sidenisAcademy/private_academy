package Trefilova.dto;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        YouTubeResponse youTubeResponse = objectMapper.readValue(new File("resources/YouTube.json"), YouTubeResponse.class);
        System.out.println(youTubeResponse);

        System.out.println();

        Methods method = new Methods();
        method.calcResults(youTubeResponse);

        System.out.println("\nSingers:");

        method.printSingers(youTubeResponse);

//        System.out.println("\nSingers and songs:");
//
        method.printSingerNameAndSong(youTubeResponse);
//
//        System.out.println();
//
        System.out.println(method.getVideoId(youTubeResponse));
//
//        System.out.println();
//
//        method.compareDates(youTubeResponse);

        //SimpleDateFormat sdf = new SimpleDateFormat("2018-09-12");
        //Date date =
    }
}
