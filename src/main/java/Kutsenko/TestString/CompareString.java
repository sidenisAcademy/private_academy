package Kutsenko.TestString;

public class CompareString {

    void compareTwoString(String str1, String str2) {
        if (str1 == str2) {
            System.out.println("str1 and str2 is the same");
        } else if (str1.equals(str2)) {
            System.out.println("str1 and str2 is the equal");
        } else if (str1.contains(str2)) {
            System.out.println("str1 contain str2");
        } else {
            System.out.println("Different strings");
        }
    }

}
