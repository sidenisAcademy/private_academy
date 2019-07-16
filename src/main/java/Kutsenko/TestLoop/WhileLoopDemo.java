package Kutsenko.TestLoop;

public class WhileLoopDemo {

    public static void main(String[] args) {

        String [] frends = new String[20];
        frends[0] = "Masha";
        frends[1] = "Matilda";
        frends[2] = "Rosa";
        frends[18] = "Hillary";
        frends[19] = "Natasha";

        int totalElements = frends.length;
        int i = 0;

        while (i < totalElements) {
            if (frends[i] == null) {
                i++;
                // Go back to check the while expression
                continue;
            }

            System.out.println("I love " + frends[i]);
            if (frends[i].equals("Rosa")) {
                break;
            }
            i++;
        }

        System.out.println("The iteration is over");

    }

}
