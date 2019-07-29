package Isabekov.YouTubeParsing;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
public class JsonParseApi {

    public static void main (String[] strq) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();

        MyDto FromJson = objectMapper.readValue(new File("target/YouTube.json"), MyDto.class);
        System.out.println(FromJson.etag);

//        Items FromJson = objectMapper.readValue(new File("target/YouTube.json"), Items.class);
//        System.out.println(FromJson.items);
//        FromJson.items.forEach();
        System.out.println();

        Methods method = new Methods();
//        method.calcResults(FromJson);

        System.out.println("\nSingers:");

        method.printSingers(FromJson);

//        System.out.println("\nSingers and songs:");
//
//        method.printSingerNameAndSong(FromJson);
//
//        System.out.println();
//
//        method.getVideoId(FromJson);
//
//        System.out.println();
//
//        method.compareDates(FromJson);

    }

}
