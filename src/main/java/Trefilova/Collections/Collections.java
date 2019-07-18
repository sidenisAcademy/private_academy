package Trefilova.Collections;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        students.add("Masha");
        students.add("Matilda");
        students.add("Rosa");
        students.add("Hillary");
        students.add("Natasha");

        System.out.println("Hello " + students.get(2));

        System.out.println();

        for (String name : students) {
            System.out.println("Hello " + name);
        }

        System.out.println();
        System.out.println("HashSet");

        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(12);
        set1.add(200);
        set1.add(350);
        set1.add(5);

        Set<Integer> set2 = new TreeSet<Integer>();
        set2.add(10);
        set2.add(5);
        set2.add(350);
        set2.add(200);

        System.out.println(set2);
        System.out.println(set1.equals(set2));

        System.out.println();
        System.out.println("Map");

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(3, "three");
        map.put(2, "two");

        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + " has value " + entry.getValue());
        }

        System.out.println();

        map.forEach((k, v) -> {
                    System.out.println("Key = " + k + " has value " + v);
        });
    }
}
