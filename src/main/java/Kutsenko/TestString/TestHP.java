package Kutsenko.TestString;

public class TestHP {

    public static void main(String[] args) {

        String repeat = new String("harry potter g p better** hermione granger -,@#$");

        String [] newStr = repeat.replaceAll("h", "H")
            .replaceFirst("p", "P")
            .replace("granger", "Granger")
            .replace("better**", "better")
            .replace("g p", "is")
            .replace("-,@#$", "that .")
            .split(" ");

        System.out.println(newStr[4] + " " + newStr[5] + " " + newStr[2] + " " + newStr[3] + " " + newStr[6] + " " + newStr[0] + " " + newStr[1] + newStr[7]);

    }
}
