package Gaisenok;

public class forFriends {
    public static void main(String[] arg) {
        String[] friends = new String[20];
        friends[0] = "Masha";
        friends[1] = "Matilda";
        friends[2] = "Rosa";
        friends[18] = "Hillary";
        friends[19] = "Natasha";

        int totalElements = friends.length;

        for (int j = 0; j < totalElements; j++) {
            if (friends[j] == null) {
                continue;
            }

            System.out.println("I love " + friends[j]);
        }
        System.out.println("The iteration is over");
    }
}