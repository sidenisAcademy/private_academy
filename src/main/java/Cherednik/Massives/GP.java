package Cherednik.Massives;

public class GP {
    public static void main(String[] args) {
        String repeat = "harry potter g p better** hermione granger -,@#$";
        System.out.println(repeat.replaceFirst("h", "H"));
        String repeat1 =  repeat.replaceAll("h", "H");
        String repeat2 = repeat1.replaceAll("g ", "");
        String repeat3 = repeat2.replaceAll("p ", "");
        String repeat5 = repeat3.replace("**", "");
        System.out.println(repeat5);
        System.out.println(repeat5.replace("-,@#$", ""));

//        System.out.println(repeat.replaceFirst("p", "P"));
//        System.out.println(repeat.replaceFirst("g", "G"));
    }
}
