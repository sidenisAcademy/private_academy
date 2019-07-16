package Cherednik.Massives;

public class Strings {

    public static void main(String[] args) {
        String a = "sidenis – your partner of trust for insurance software engineering\n";
        String string1 = "a";
        String string2 = "a";
        System.out.print(a.replaceAll("sidenis", "Sidenis"));
        System.out.println(a.replaceFirst("y", "Y"));
        System.out.println(a.replace('f', 'F'));
        String secondLine = a.split("–")[1];
        System.out.println(secondLine);
        compare(string1, string2);
    }

    public static String compare (String string1, String string2) {
        if (string1==string2) {
            return ("Memory is the same");
        } else if (string1.contains(string2)) {
            return ("String1 contains String2");
        } else if (string1.equals(string2)) {
            return ( "String1 and String2 are the same");
        }
        return ("Strings are different");
    }
}

