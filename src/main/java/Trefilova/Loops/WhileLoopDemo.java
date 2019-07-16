package Trefilova.Loops;

public class WhileLoopDemo {
    public static void main(String[] args) {
        String [] friends = new String[20];
        friends[0] = "Masha";
        friends[1] = "Matilda";
        friends[2] = "Rosa";
        friends[18] = "Hillary";
        friends[19] = "Natasha";

        int totalElements = friends.length;
        int i = 0;

        //loop1
        while (i < totalElements) {
            if(friends[i] == null) {
                i++;
                continue;
            }

            System.out.println("I love " + friends[i]);

            if(friends[i].equals("Rosa"))
                break;

            i++;
        }

        System.out.println("The iteration is over");

        System.out.println();

        //loop2
        for (int j = 0; j < totalElements; j++) {
            if(friends[j] == null) {
                continue;
            }
            System.out.println("I love " + friends[j]);
        }
        System.out.println("The iteration is over");

        System.out.println();

        //loop3
        for (String name : friends) {
            if(name == null) {
                continue;
            }
            System.out.println("I love " + name);
        }
        System.out.println("The iteration is over");
    }
}
