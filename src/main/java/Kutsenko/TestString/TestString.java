package Kutsenko.TestString;

public class TestString {
    public static void main(String[] args) {

        String str = new String("sidenis – your partner of trust for insurance software engineering");
        System.out.println(str.replace("sidenis", "Sidenis"));
        System.out.println(str.replaceFirst("y", "Y"));
        System.out.println(str.replaceAll("f", "F"));
        System.out.println(str.split(" – ")[1]);

        String str1 = "Test1";
        String str2 = "Test1";
        String str3 = new String("Test1");
        String str4 = new String("Tes");
        String str5 = new String("yyy");

        CompareString myStr = new CompareString();
        myStr.compareTwoString(str1, str2);
        myStr.compareTwoString(str1, str3);
        myStr.compareTwoString(str3, str4);
        myStr.compareTwoString(str3, str5);

    }
}