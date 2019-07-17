package Isabekov;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayList_Isabekov {
    public static void main(String[] args) {
        ArrayList<String> myArray = new ArrayList<>();
        myArray.add("Masha");
        myArray.add("Matilda");
//        friends[0] = "Masha";
//        friends[1] = "Matilda";
//        friends[2] = "Rosa";
//        friends[18] = "Hillary";
//        friends[19] = "Natasha";

        System.out.println("Hello " + myArray.get(0));
        for (String temp: myArray) {
            System.out.println("Hello " +temp);}


//    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
//       System.out.println(map.get(1));
        for ( Integer key : map.keySet() ) {
             System.out.println(key);
        }
        map.forEach((k,v) -> {
            System.out.println(k + v);
        } );

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }


    }
}

