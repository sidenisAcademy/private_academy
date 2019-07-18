package Cherkashin;

import java.util.*;

public class ArrayTraining {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        students.add("IVAN");
        students.add("VASILIY");
        students.add("PETR");
        students.add("ALESHA");
        students.add("ILYA");
        System.out.println("Hello " + students.get(0));
        System.out.println("Hello " + students.get(1));
        System.out.println("Hello " + students.get(2));
        System.out.println("Hello " + students.get(3));
        System.out.println("Hello " + students.get(4));

        System.out.println();

        //loop
        for (String temp : students) {
            System.out.println("Hello " + temp);
        }
        System.out.println();

        //hashset comparing
        Set<String> student = new HashSet<String>();
        student.add("Masha");
        student.add("Matilda");
        student.add("Rosa");
        student.add("ALESHA");
        student.add("ILYA");

        Set<String> student3 = new HashSet<String>();
        student3.add("ILYA");
        student3.add("Masha");
        student3.add("Matilda");
        student3.add("Rosa");
        student3.add("ALESHA");

        System.out.println(student);
        System.out.println(student3);

        System.out.println(student.equals(student3));
        System.out.println();

        //map
        HashMap<String, String> maptraining = new HashMap();
        maptraining.put("A", "ILYA");
        maptraining.put("B", "Masha");
        maptraining.put("C", "Matilda");
        maptraining.put("D", "Rosa");
        maptraining.put("E", "ALESHA");
        System.out.println();

        System.out.println(maptraining.get("A"));
        for (Map.Entry<String, String> entry : maptraining.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
        System.out.println();
        for (String key : maptraining.keySet()) {
            System.out.println(key);
        }

    }
}
