package Cherkashin;

public class WhileLoopDemo {
    public static void main(String[] args) {
        String[] friends = new String[20];
        friends[0] = "Masha";
        friends[1] = "Matilda";
        friends[2] = "Rosa";
        friends[18] = "Hillary";
        friends[19] = "Natasha";
        int totalElements = friends.length;
        int i = 0;
//method with 'while' loop
        while (i < totalElements) {
            if (friends[i].equals("Rosa")) {
                System.out.println("i love Rosa");
                break;
            }
            System.out.println("i love " + friends[i]);
            i++;
        }
        System.out.println();
//method with 'for' loop
        for (int j = 0; j < friends.length; j++) {
            if (friends[j] == null) {
                j++;
                continue;
            }
            System.out.println("i love " + friends[j]);
            if (friends[j].equals("Rosa")) {
                break;
            }
        }
        System.out.println();
//method with 'each-for' loop
        for (String name : friends) {
            if (name == null) {
                continue;
            }
            System.out.println("i love " + name);
            if (name.equals("Rosa")) {
                break;
            }
        }
        System.out.println();
        System.out.println("The iteration is over");
    }
}
