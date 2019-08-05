package Kutsenko.TestWordPress;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class TestJSONParserWP {

    public static List<WordPress> parseJSON(String jsonPath) {
        ObjectMapper objectMapper = new ObjectMapper();
        File json = null;
        WordPress[] wordPresses = null;
        try {
            json = new File(jsonPath);
            wordPresses = objectMapper.readValue(json, WordPress[].class);
        } catch (Exception e) {
            System.out.println(e);
        }

        return Arrays.asList(wordPresses);
    }

    static void compareIdAndRendered(List<WordPress> wordPressList) {

        System.out.println("\nComparing id and rendered");
        for (WordPress wordPress : wordPressList) {
            System.out.println("id " + wordPress.id + " equals to id from rendered " + wordPress.guid.rendered + ": "
                    + wordPress.id.toString().equals(wordPress.guid.rendered.split("p=")[1]));
        }

    }


    static void printMetaOrTags(List<WordPress> wordPressList) {
        System.out.println("\nPrint 'meta' if 'status' true:");
        for (WordPress wordPress : wordPressList) {
            if (wordPress.status) {
                    System.out.println("Meta:");
                    for (String item : wordPress.meta) {
                        System.out.println(item);
                    }
                    System.out.println();
                } else {
                    System.out.println("Tags:");
                    for (Integer item : wordPress.tags) {
                        System.out.println(item);
                    }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        List<WordPress> wordPressList = parseJSON("resources/WordPress.json");

        compareIdAndRendered(wordPressList);
        printMetaOrTags(wordPressList);

    }

}
