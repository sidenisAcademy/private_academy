package Nakhanov.Strings;

public class Main {

    public static String compareTwoStrings(String str1, String str2){
        if(str1 == str2)
            return "str1 == str2";
        else if (str1.equals(str2))
            return "value of str1 == value of str2";
        else if (str1.contains(str2))
            return "str2 is part of str1";
        else  if (str2.contains(str1))
            return "str1 is part of str2";
        else return "str1 isn't related with str2";


    }

    public static void main(String[] args) {

        String str = new String("sidenis - your partner of trust o insurance software engineering");

        str = str.substring(0, 1).toUpperCase() + str.substring(1);
        System.out.println(str);
        str = str.replaceFirst("y", "Y");
        str = str.replaceAll("f", "F");
        str = str.split("- ") [1];


        String str1 = new String("Ololo");
        String str2 = "Ololo";
        String str3 = "Ololosh";
        String str4 = str1;
        String str5 = new String("asdf");

        System.out.println(str);
        System.out.println(compareTwoStrings(str5, str1));
        System.out.println(compareTwoStrings(str1, str2));
        System.out.println(compareTwoStrings(str1, str4));
        System.out.println(compareTwoStrings(str4, str3));
        System.out.println(compareTwoStrings(str3, str4));
    }
}
