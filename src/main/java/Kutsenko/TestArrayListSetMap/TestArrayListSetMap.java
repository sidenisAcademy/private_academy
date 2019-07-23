package Kutsenko.TestArrayListSetMap;
import java.util.*; // import the ArrayList and Set classes

public class TestArrayListSetMap {

    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> students = new ArrayList();

        students.add("Natalia");
        students.add("Anna");
        students.add("Kate");

        System.out.println("First way:");
        System.out.println("Hello " + students.get(0));

        System.out.println();
        System.out.println("Second way:");
        for (String name: students) {
            System.out.println("Hello " + name);
        }

        // HashSet
        Set<Integer> firstSet = new HashSet<>(Arrays.asList(1,3,2,1,1,13,3,5));
        Set<Integer> secondSet = new TreeSet<>(Arrays.asList(3,6,7,33,12,6));

        System.out.println();
        System.out.println("HashSets:");
        System.out.println("firstSet equal secondSet is " + firstSet.equals(secondSet));
        System.out.println(firstSet);
        System.out.println(secondSet);

        // Array
        String [] friends = {"Masha", "Matilda", "Rosa", "Sharon"};
        System.out.println();
        System.out.println("Array:");
        for (int i = 0; i < friends.length; i++) {
            System.out.println("number #" + i + " = " + friends[i]);
        }

        // Map
        Map<Integer, String> map = new HashMap<>();
        map.put(77, "fffff");
        map.put(3, "aaaaaaaaaa");
        map.put(565, "wwwwww");
        map.put(33, "kkkkkk");

        System.out.println();
        System.out.println("Map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + " has value = " + entry.getValue());
        }

    }
}
