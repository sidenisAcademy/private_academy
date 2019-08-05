package Nakhanov.While;

import Gaisenok.Arrays;

import java.util.stream.Stream;

public class WhileLoopDemo {

    public static void main(String[] args) {
        String[] friends = new String[20];
        friends[0] = "Masha";
        friends[1] = "Matilda";
        friends[2] = "Rosa";
        friends[18] = "Hillary";
        friends[19] = "Natasha";

        int totalElements = friends.length;
//stream
        Stream.of(friends).filter(friend -> friend == "Rosa")
                .peek(friend -> System.out.println("Rosa " + friend))
        .filter(friend -> friend !=null && friend != "Rosa")
        .forEach(friend -> System.out.println("ololo" + friend));



//// loop for
//        for (int i = 0; i < totalElements; i++){
//            if(friends[i] == null){}
//            else if (friends[i].equals("Rosa")) {
//                System.out.println(friends[i]);
//                break;
//            }
//            System.out.println("I love " + friends[i] + " and for loop");
//        }
//// foreach
//        for (String name : friends){
//            if (name == null){}
//            else if (name.equals("Rosa")){
//                System.out.println(name);
//                break;
//            }
//            System.out.println("I love foreach and " + name);
//        }
//// while
//        int j = 0;
//        while (j < totalElements){
//            if (friends[j] == null){
//                j++;
//                continue;
//            }
//            System.out.println("I love " + friends[j]);
//            j++;
//        }
//        System.out.println("The iteration is over");

    }
}
