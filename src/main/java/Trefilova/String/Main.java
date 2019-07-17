package Trefilova.String;

public class Main {
    public static void main(String[] args) {
        String repeat = "harry potter g p better** hermione granger -,@#$";
        System.out.println(repeat.substring(0, 12).toUpperCase() + repeat.substring(12, 26) + repeat.substring(26, 42).toUpperCase() + repeat.substring(42));
        System.out.println(repeat.substring(0, 12) + repeat.substring(16, 23) + repeat.substring(25, 28) + repeat.substring(28, 42));

        System.out.println(repeat.replace("g p ", "").replace("-,@#$", "").replace("**", ""));

        String[] newRepeat = repeat.replace("g p ", "").replace("-,@#$", "").replace("**", "").split(" ");
        System.out.println(
                newRepeat[3].substring(0, 1).toUpperCase() + newRepeat[3].substring(1) + " " +
                newRepeat[4].substring(0, 1).toUpperCase() + newRepeat[4].substring(1) +
                " is better than " +
                newRepeat[0].substring(0, 1).toUpperCase() + newRepeat[0].substring(1) + " " +
                newRepeat[1].substring(0, 1).toUpperCase() + newRepeat[1].substring(1)
        );

        System.out.println(repeat.substring(26, 27).toUpperCase() + repeat.substring(27, 35) + repeat.substring(35, 36).toUpperCase() +
                repeat.substring(36, 42) + " is better than " + repeat.substring(0, 1).toUpperCase() + repeat.substring(1, 6) +
                repeat.substring(6, 7).toUpperCase() + repeat.substring(7, 12));
    }

}
