package Gaisenok;

import java.util.*;

public class Arrays {
    public static void main(String[] arg) {
        List<String> students = new ArrayList();
        students.add("Masha");
        students.add("Matilda");
        students.add("Rosa");
        students.add("Hillary");
        students.add("Natasha");

        for (int i = 0; i < students.size(); i++) {
            System.out.println("Hello " + students.get(i));
        }

        Set<Integer> setNumberOne = new TreeSet();
        Set<Integer> setNumberTwo = new HashSet();
        setNumberOne.add(34);
        setNumberOne.add(111);
        setNumberOne.add(67);
        setNumberOne.add(55);

        setNumberTwo.add(67);
        setNumberTwo.add(55);
        setNumberTwo.add(34);
        setNumberTwo.add(111);

        if (setNumberOne.equals(setNumberTwo)) System.out.println("setNumberOne equals setNumberTwo");
        else System.out.println("setNumberOne is not equal to setNumberTwo");
        System.out.println(setNumberOne);

        String[] friends = new String[20];
        friends[0] = "Masha";
        friends[1] = "Matilda";
        friends[2] = "Rosa";
        friends[18] = "Hillary";
        friends[19] = "Natasha";

        for (int i = 0; i < friends.length; i++) {
            //System.out.println("Number#"+i+" is "+ friends[i]);
        }
        Map<Integer, String> myMap = new HashMap();
        myMap.put(1, "Masha");
        myMap.put(2, "Matilda");
        myMap.put(3, "Lexi");
        myMap.put(4, "Jane");

        //System.out.println(myMap);
        for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}