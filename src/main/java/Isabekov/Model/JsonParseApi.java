package Isabekov.Model;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonParseApi {

    public static void main (String[] strq) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();

//        DTO1 FromJson = objectMapper.readValue(new File("target/YouTube.json"), DTO1.class);
//        System.out.println(FromJson.items);

        Items FromJson = objectMapper.readValue(new File("target/YouTube.json"), Items.class);
        System.out.println(FromJson.items);
//        FromJson.items.forEach();

    }
}
