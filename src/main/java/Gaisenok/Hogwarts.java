package Gaisenok;

public class Hogwarts {
    public static void main(String[] arg) {
        String repeat = "harry potter g p better** hermione granger -,@#$";
        System.out.println((repeat.substring(26, 42).replaceFirst("h", "H")
                + " is " + repeat.substring(17, 23) +
                " than " + repeat.substring(0, 12).replaceFirst("h", "H"))
                .replaceFirst("p", "P")
                .replaceFirst("gr", "Gr"));
    }
}
