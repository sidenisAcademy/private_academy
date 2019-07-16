package Gaisenok;

public class forEachFriends {
    public static void main(String[] arg) {
        String[] friends = new String[20];
        friends[0] = "Masha";
        friends[1] = "Matilda";
        friends[2] = "Rosa";
        friends[18] = "Hillary";
        friends[19] = "Natasha";

        for (String friendName : friends) {
            if (friendName == null) continue;
            else
                System.out.println("I love " + friendName);
        }
        System.out.println("The iteration is over");
    }
}