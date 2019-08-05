import org.junit.Test;

import java.util.*;

public class FirstTest {

    @Test
    public void Test() {

        String [] friends = new String [20];

        friends[0] = "Masha";
        friends[1] = "Matilda";
        friends[2] = "Rosa";

        friends[19] = "Natasha";

        for (int i = 0; i < friends.length; i++) {
            System.out.println("my friend " + friends[i]);
        }

        for (String name: friends) {
            System.out.println("my friend " + name);
        }

        // Do While Loop
        int totalElements = 10;
        int i=0;

        do{
            // Do something
            i++;
        } while (i < totalElements);

    }


//        System.out.println("Test");
//
//        List<Integer> s1 = new ArrayList<>(Arrays.asList(1,2,3));
//
//        Set<Integer> s2 = new HashSet<>(Arrays.asList(1,2,3));
//
//
//        System.out.println(s1.equals(s2));
//
//
//        s1.forEach(System.out::println);
////        s1.forEach(x -> System.out.println(x));
//
////        for (String temp: s1) {
////            System.out.println(temp);
////        }
//
//        HashMap<Integer, String> map = new HashMap<>();
//
//        map.put(1, "A");    //allowed
//        map.put(2, "B");    //allowed
//
//        HashMap<Integer, String> map2 = new HashMap<>();
//
//        map2.put(2, "B");    //allowed
//        map2.put(1, "A");    //allowed
//        map2.put(3, "A");    //allowed
//
//        System.out.println(map.equals(map2));
////        map.put("3", "C");  //NOT allowed - Key is string
//
//        System.out.println(map.get(1));
//
//        System.out.println(map.keySet());
//
//        for ( Integer key : map.keySet() ) {
//            System.out.println(key);
//        }
//
//        map.forEach((k,v) -> {
//            System.out.println(k + v);
//        });
//
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + entry.getValue());
//        }
//    }
}
