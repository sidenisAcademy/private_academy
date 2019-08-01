package Isabekov.WordPress;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class WordPressParse {
    public static void main(String[] strq) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();

        WordPressMain[] FromJson = objectMapper.readValue(new File("target/WordPress.json"), WordPressMain[].class);
//         FromJson[0].id.toString();
        for (int i = 0; i < FromJson.length; i++) {
            System.out.println(FromJson[i]);

//            for (String name : FromJson) {
//                System.out.println();
//            }

            //удалить все символы до цифт в строке с урлом, далее сравнить две строки  - from Json to string и ту часть строки, которую мы вырезилм

        }
    }
}

