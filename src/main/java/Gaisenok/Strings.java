package Gaisenok;

public class Strings {
    public static void main(String[] arg) {
        Strings myString = new Strings();
        String sidenisTest = new String("sidenis – your partner of trust for insurance software engineering");
        System.out.println(sidenisTest.replaceFirst("s", "S"));
        System.out.println(sidenisTest.replaceFirst("y", "Y"));
        System.out.println(sidenisTest.replaceAll("f", "F"));
        System.out.println(sidenisTest.split("–")[1].trim());
        System.out.println(myString.compareTwoString("hello", "hello"));
        System.out.println(myString.compareTwoString(new String("hello"), "hello"));
        System.out.println(myString.compareTwoString("Hello, world!", "world"));
        System.out.println(myString.compareTwoString("hello", "hi"));

    }
    String compareTwoString(String str1, String str2){
        if (str1==str2)
            return "str1 equal str2";
        if (str1.equals(str2))
            return "str1 and str2 are the same";
        if (str1.contains(str2))
            return "str1 contains str2";
        else
        return "str1 and str2 are not equal";
    }
}
