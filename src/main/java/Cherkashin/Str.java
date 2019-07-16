package Cherkashin;

public class Str {
    public static void main(String[] args) {
        String text = new String("sidenis - your partner of trust for insurance software engineering");
        System.out.println(text.replace("sidenis", "Sidenis"));
        System.out.println(text.replaceFirst("y", "Y"));
        System.out.println(text.replaceAll("f", "F"));
//        String SecondPart = text.split("-")[1];
//        System.out.println(SecondPart);
        System.out.println(text.split(" - ")[1]);

        String str1 = "Sidenis - your blah blah blah";
        String str2 = "Sidenis - your blah blah blah";
        String str3 = "Sidenis";
        String str4 = "sidenis - your blah blah blah";

        compareTwoString(str1, str2);
        System.out.println(compareTwoString(str1, str2));
        System.out.println(compareTwoString(str1, str3));
        System.out.println(compareTwoString(str1, new String("Sidenis - your blah blah blah")));
        System.out.println(compareTwoString(str1, str4));
    }

    public static String compareTwoString(String first, String second) {
        if (first == second) {
            return "first == second";
        } else if (first.equals(second)) {
            return "first equals second";
        } else if (first.contains(second)) {
            return "first contains second";
        }
        return "first isn't contain second and they aren't the same";
    }
}
