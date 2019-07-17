package Trefilova.String;

public class StringChallenge {
    public static void main(String[] args) {
        String str = new String("sidenis - your partner of trust for insurance software engineering");

        System.out.println(str.replaceAll("sidenis", "Sidenis"));
        System.out.println(str.replaceFirst("y", "Y"));
        System.out.println(str.replaceAll("f", "F"));
        String secondPart = str.split("- ")[1];
        System.out.println(secondPart);

        System.out.println();

        TwoStringCompariton compariton = new TwoStringCompariton();

        String testStr1 = new String("Dog");
        String testStr2 = new String("Dog");

        System.out.println(compariton.compareTwoString("Test", "Test"));
        System.out.println(compariton.compareTwoString("New string", "New"));
        System.out.println(compariton.compareTwoString(testStr1, testStr2));
        System.out.println(compariton.compareTwoString("Name", "City"));

        System.out.println("S" + str.substring(1));
        System.out.println(str.substring(0,1).toUpperCase() + str.substring(1));
    }
}
