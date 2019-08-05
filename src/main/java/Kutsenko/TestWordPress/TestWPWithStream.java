package Kutsenko.TestWordPress;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestWPWithStream {

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
        System.out.println("Meta:");
        wordPressList.stream()
                .filter(wordPress -> wordPress.status)
                .map(wordPress -> wordPress.meta)
                .forEach(x -> Arrays.stream(x).forEach(System.out::println));
        System.out.println("Tags:");
        wordPressList.stream()
                .filter(wordPress -> !wordPress.status)
                .map(wordPress -> wordPress.tags)
                .forEach(x -> Arrays.stream(x).forEach(System.out::println));
    }

    public static void main(String[] args) {

        List<WordPress> wordPressList = parseJSON("resources/WordPress.json");

        compareIdAndRendered(wordPressList);
        printMetaOrTags(wordPressList);

    }

}
