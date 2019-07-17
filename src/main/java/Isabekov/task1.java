package Isabekov;

public class task1 {
    public static void main(String[] args){
        String str1 = "harry potter g p better** hermione granger -,@#$";

        System.out.println(str1.substring(26,42).replaceFirst("h","H").replaceFirst("p","P"));
    }


}