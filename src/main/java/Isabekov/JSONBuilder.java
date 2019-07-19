package Isabekov;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class JSONBuilder {

    public static void main(String[] args) throws Exception {
       List<String> list = new ArrayList<>();
       list.add("sadasd");
       list.add("sadcxzc");

        System.out.println(list.get(1));


        for (String temp: list) {
            System.out.println(temp);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }



}

