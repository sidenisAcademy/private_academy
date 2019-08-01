package Trefilova.Parsing;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        ObjectMapper obj = new ObjectMapper();
//        WordPress[] wordPress = obj.readValue(new File("C:\\Examples\\private_academy\\resources\\WordPress.json"), WordPress[].class);
//
//        Operations operations = new Operations();
//        operations.compareIds(wordPress);

        System.out.println();

        //Operations.displayInfo(wordPress);
    }

    @Test
    public void test1() throws Exception {
        ObjectMapper obj = new ObjectMapper();
//        WordPress[] wordPress = obj.readValue(new File("C:\\Examples\\private_academy\\resources\\WordPress.json"), WordPress[].class);
//
//        Operations operations = new Operations();
//        operations.compareIds(wordPress);
    }

    @Test
    public void test2() throws Exception {
        ObjectMapper obj = new ObjectMapper();
        //WordPress[] wordPress = obj.readValue(new File("C:\\Examples\\private_academy\\resources\\WordPress.json"), WordPress[].class);

//        Operations operations = new Operations();
//        operations.displayInfo(wordPress);
    }
}
