package Trefilova.Exceptions;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Examples\\private_academy\\resources\\file.txt");

        Exceptions exceptions = new Exceptions();
        exceptions.openFile1(file);

        System.out.println();

        try {
            exceptions.openFile2(file);
        }
        catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
        catch (IOException e) {
            System.out.println("Error is found");
        }


        System.out.println();

        exceptions.openFile3(file);
    }
}
