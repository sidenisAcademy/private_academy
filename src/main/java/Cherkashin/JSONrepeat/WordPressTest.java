package Cherkashin.JSONrepeat;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class WordPressTest {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        WP[] wordPress = objectMapper.readValue(new File("resources/WordPress.json"), WP[].class);
        IdEqualsP(wordPress);
    }

    public static void IdEqualsP(WP[] wordPress) {
        for (WP elements : wordPress) {
            boolean result = elements.id.toString().equals(elements.guid.rendered.split("p=")[1]);
//            System.out.println("id: " +elements.id + " = rendered " + elements.guid.rendered.split("p=")[1] + ": " + result);
//            System.out.println();

            if (result)
                for (String values : elements.meta) {
                    System.out.println("id = rendered => " + values);
                    System.out.println();
                }
            else
                for (int values : elements.tags) {
                    System.out.println("id != rendered => " + values);
                    System.out.println();
                }
        }
    }
}