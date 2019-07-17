package Cherkashin;

public class StrRepeat {
    public static void main(String[] args) {
        String text = new String("harry potter g p better** hermione granger -,@#$");
        String textnew = new String(
                text.replace("h", "H").replace("p", "P")
                        .replaceFirst("g", "").replaceFirst("g", "G")
                        .replace("**", "").replace("-,@#$", "")
                        .replaceAll("\\  P", "")
        );
        String[] newstring = textnew.split(" ");

        System.out.println(newstring[3] + " " + newstring[4] + " " + "is" + " " + newstring[2] + " " + "than" + " " + newstring[0] + " " + newstring[1]);
    }
}
