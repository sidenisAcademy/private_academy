package Cherednik.Massives;

public class TheSameLoop {
    public static void main(String[] args) {
        String[] friends = new String[20];
        friends[0] = "Masha";
        friends[1] = "Matilda";
        friends[2] = "Rosa";
        friends[18] = "Hillary";

        int totalElements = friends.length;


        for (int i = 0; i < totalElements; i++) {
            if (friends[i] == null) {
                continue;
            }
            System.out.println("I love " + friends[i]);
            i++;
        }

       for (String temp: friends) {
           if (temp == null) {
               continue;
           }

            System.out.println("I love " + temp);
            
        }
    }
}
