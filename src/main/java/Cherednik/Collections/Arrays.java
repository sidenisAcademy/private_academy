package Cherednik.Collections;

import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList();
        students.add("Masha");
        students.add("Matilda");
        students.add("Rosa");
        students.add("Hillary");

        System.out.println("Hello " + students.get(0));
        System.out.println("Hello " + students.get(1));
        System.out.println("Hello " + students.get(2));
        System.out.println("Hello " + students.get(3));

        for (String temp : students) {
            System.out.println("Hello " + temp);
        }

        Set<Integer> numbers = new TreeSet<Integer>();
        numbers.add(451);
        numbers.add(33);
        numbers.add(22);
        numbers.add(434);

        Set<Integer> numbers1 = new HashSet<Integer>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);


        System.out.println(numbers);
        System.out.println(numbers.equals(numbers1));

        HashMap<String, String> map = new HashMap();
        map.put("1", "A");
        map.put("2", "b");
        System.out.println(map.get("1"));

        for (String temp : map.values()
        ) {
            System.out.println(temp);

        }

        for (String temp : map.keySet()
        ) {
            System.out.println(temp);

        }

        map.forEach((k,v) -> System.out.println( k + v));


//        String[] friends = new String[20];
//        friends[0] = "Masha";
//        friends[1] = "Matilda";
//        friends[2] = "Rosa";
//        friends[18] = "Hillary";
//
//        for (String temp: friends) {
//            if (temp == null) {
//                continue;
//            }
//
//            System.out.println("I love " + temp);
//
//        }
//    }
    }
}
