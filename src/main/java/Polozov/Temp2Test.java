package Polozov;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Temp2Test {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        Temp2 taxRateFile =  objectMapper.readValue(new File("resources/WordPress.json"), Temp2.class);
        System.out.println(taxRateFile.tags[1]);
    }
}
