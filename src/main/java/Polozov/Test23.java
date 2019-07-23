package Polozov;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class Test23 {

    static int divideByZero() throws InterruptedException {
        Thread.sleep(100);
        return 25 / 0;
    }


    public void test() {

    }

    public static void main(String[] args) {

//        try {
//            readFile(); // may throw an error
//        } catch (FileNotFoundException | EOFException | IOException e) {
//
//            System.out.println("Problem reading file" + e.getMessage());
//        } catch (Exception e3) {
//            System.out.println("Something went wrong");
//        }

        try {
            divideByZero();
        } catch (InterruptedException e) {
            System.out.println(e);
        }


//        String str = new String("Site is BeginnersBook.com");
//
//        System.out.print("String after replacing all 'o' with 'p' :" );
//        System.out.println(str.replace('o', 'p'));
//
//        System.out.print("String after replacing all 'i' with 'K' :" );
//        System.out.println(str.replace('i', 'K'));
//
//        System.out.println(str);
////        String after replacing all 'o' with 'p' :Site is BeginnersBppk.cpm
////        String after replacing all 'i' with 'K' :SKte Ks BegKnnersBook.com
//
//
//        String str2 = new String("Site is BeginnersBook.com BeginnersBook.com BeginnersBook.com");
//
//        System.out.print("String after replacing com with net :" );
//        System.out.println(str2.replaceFirst("com", "net"));
//
//        System.out.print("String after replacing Site name:" );
//        System.out.println(str2.replaceFirst("BeginnersBook.com", "XYZ.com"));


//
////        String after replacing com with net :Site is BeginnersBook.net
////        String after replacing Site name:Site is XYZ.com
//
//        String str3 = new String("My .com site is BeginnersBook.com");
//        System.out.print("String after replacing all com with net: " );
//        System.out.println(str3.replaceAll("com", "net"));
//
//        System.out.print("Replacing whole String: " );
//        System.out.println(str3.replaceAll("(.*)Beginners(.*)", "Welcome"));

//        String after replacing all com with net: My .net site is BeginnersBook.net
//        Replacing whole String: Welcome
//

//        String str1 = new String("Hello");
//        String str2 = new String("Hi");
//        String str3 = new String("Hello");
//        System.out.println("str1 contains str2:" + str1.contains(str2));
//        System.out.println("str1 contains str2:" + str2.contains(str1));
//        System.out.println("str1 contains str3:" + str1.contains(str3));


//        String str4 = "Hello";
//        String str5 = "Hello";
//
//        int i = 0;
//        Integer j = 0;
//        ArrayList arrayList = new ArrayList<>();
//        arrayList.add(" fadfs ");
//        arrayList.add(1);
//        System.out.println(arrayList);


//        str1 equals to str2:false
//        str1 equals to str3:true
//        str1 equals to Welcome:false
//        str1 equals to Hello:true
//        str1 equals to hello:false

//
//        String str1 = new String("Hello");
//        String str2 = new String("Hi");
//        String str3 = new String("Hello");
//        String str4 = "Hello";
//        String str5 = "Hello";
//
//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//        System.out.println(str1 == "Hello");
//        System.out.println("asdas  " + str4.equals(str5));
//
//        String str = "geekss@for@geekss";
//        String secondWord = str.split("@")[1];
//        System.out.println(secondWord);
    }
}
