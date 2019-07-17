package Nakhanov.Exceptions;

import java.io.*;

public class ExceptionsTest {

    public static void openFile(File file) throws IOException {

        FileInputStream reader = new FileInputStream(file);

        int i = 0;

        while ((i = reader.read()) != -1) {

            System.out.print((char) i);
        }
        System.out.println("\n");
        reader.close();
    }

    public static void openFile1(File file) {

        try (FileInputStream reader = new FileInputStream(file)) {

            int i = 0;

            while ((i = reader.read()) != -1) {
                System.out.print((char) i);

            }


        } catch (FileNotFoundException e) {
            System.out.println("File is not found " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Input Error " + e.getMessage());
        }


    }
}


