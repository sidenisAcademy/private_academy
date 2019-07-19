package Isabekov.WordPress;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;

public class WordPressParse {

    @Test
    public void testString() throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();

        WordPressMain[] FromJson = objectMapper.readValue(new File("target/WordPress.json"), WordPressMain[].class);

        for (int i = 0; i < FromJson.length; i++) {
            System.out.println("show " + FromJson[i]);

            //удалить все символы до цифт в строке с урлом, далее сравнить две строки  - from Json to string и ту часть строки, которую мы вырезилм

//        compareTwoString(str1, str2);
//        public static String compareTwoString(String first, String second) {
//            if (first == second) {
//                return "first == second";
//            } else if (first.equals(second)) {
//                return "first equals second";
//            } else if (first.contains(second)) {
//                return "first contains second";
//            }
//            return "first isn't contain second and they aren't the same";
//        System.out.println(int id.equals public String rendered);
        }


    }
}
