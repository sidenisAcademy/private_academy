package Kutsenko.TestLoop;

public class forEachLoopDemo {
    public static void main(String[] args) {

        String [] frends = new String[20];
        frends[0] = "Masha";
        frends[1] = "Matilda";
        frends[2] = "Rosa";
        frends[18] = "Hillary";
        frends[19] = "Natasha";

        for (String name: frends) {
            if (name == null) {
                // Go back to check the while expression
                continue;
            }

            System.out.println("I love " + name);
            if (name.equals("Rosa")) {
                break;
            }
        }

        System.out.println("The iteration is over");

    }
}
