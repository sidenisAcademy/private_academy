package Isabekov;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream2 {

    public static void main(String args[]) {
        FileInputStream fin = null;
        try {
//            char arrch;
            fin = new FileInputStream("C:\\academy\\testout.txt");
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
//        finally {
//            if (fin != null){
//                try {
//                    System.out.println("close");
//                    fin.close();
//                }catch(IOException e1){
//                    e1.printStackTrace();
//                }
//            }
//        }
    }

}
