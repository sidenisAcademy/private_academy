package Isabekov;

import java.io.FileInputStream;

public class FileInputStream2 {

    public static void main(String args[]) {
        try {
//            char arrch;
            FileInputStream fin = new FileInputStream("C:\\academy\\testout.txt");
            int i = fin.read();
            System.out.print((char) i);

            //FileInputStream fin = new FileInputStream("C:\\academy\\testout.txt");
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
                fin.close();
            } catch(Exception e){
                System.out.println(e);
            }
        }

    }
