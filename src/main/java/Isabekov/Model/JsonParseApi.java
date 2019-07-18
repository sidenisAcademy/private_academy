package Isabekov.Model;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonParseApi {

    public static void main (String[] strq) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();

        DTO1 FromJson = objectMapper.readValue(new File("target/YouTube.json"), DTO1.class);
        System.out.println(FromJson.etag);

//        Items FromJson = objectMapper.readValue(new File("target/YouTube.json"), Items.class);
//        System.out.println(FromJson.items);
//        FromJson.items.forEach();
        System.out.println();

        Methods method = new Methods();
        method.calcResults(DTO1);

        System.out.println("\nSingers:");

        method.printSingers(DTO1);

        System.out.println("\nSingers and songs:");

        method.printSingerNameAndSong(DTO1);

        System.out.println();

        method.getVideoId(DTO1);

        System.out.println();

        method.compareDates(DTO1);

    }
}
