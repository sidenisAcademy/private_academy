package Nakhanov.Collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Masha");
        names.add("Matilda");
        names.add("Rosa");
        names.add("Hillary");
        names.add("Natasha");

        for (String x : names) {
            if (x == "Rosa") {
                System.out.println("Where is " + x + "?");
            }
            System.out.println("Hello " + x);
        }
        System.out.println(names.get(2));


        Set<Integer> firstSet = new HashSet<>(Arrays.asList(2, 44, 5, 666, 3, 7));
        Set<Integer> secondSet = new HashSet<>(Arrays.asList(7, 2, 44, 5, 3, 666));

        System.out.println(secondSet);
        System.out.println(firstSet.equals(secondSet));

        int[] intArr = new int[]{2,5,6,7,8,66,3,11};

        for (int i = 0; i < intArr.length; i++){
            System.out.println("number " + i + " = " +intArr[i]);
        }

        Map<Integer, String> newMap = new TreeMap<>();

        newMap.put(4, "Masha");
        newMap.put(7, "Matilda");
        newMap.put(99, "Masha");
        newMap.put(12, "Masha");

        newMap.forEach((key, value) -> System.out.println("Key " + key + " has value " + value));



    }
}
