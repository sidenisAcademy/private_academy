package Trefilova.String;

public class TwoStringCompariton {

    public String compareTwoString(String str1, String str2) {
        if (str1 == str2)
            return "str1 = str2";
        else if (str1.equals(str2))
            return "str1 and str2 are the same";
        else if (str1.contains(str2))
            return "str1 contains str2";
        return "Strings are not matched";
    }
}
