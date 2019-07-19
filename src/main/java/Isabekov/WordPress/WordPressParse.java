package Isabekov.WordPress;

import Isabekov.Model.DTO1;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class WordPressParse {
    public static void main (String[] strq) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();

        WordPressMain FromJson = objectMapper.readValue(new File("target/WordPress.json"), WordPressMain.class);
        System.out.println(FromJson.guid);
    }
}
