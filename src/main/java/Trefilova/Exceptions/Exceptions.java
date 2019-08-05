package Trefilova.Exceptions;

import java.io.*;

public class Exceptions{

    void openFile1(File file) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            int i;
            while((i=fileInputStream.read())!= -1) {
                System.out.print((char)i);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
        catch (IOException e) {
            System.out.println("Error is found");
        }
        finally {
            if (file != null) {
                try {
                    fileInputStream.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    void openFile2(File file) throws FileNotFoundException, IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        int j;
        while((j=fileInputStream.read())!= -1) {
            System.out.print((char)j);
        }
    }

    void openFile3(File file) {
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Examples\\private_academy\\resources\\file.txt")) {
            int i;
            while((i=fileInputStream.read())!= -1) {
                System.out.print((char)i);
            }
        }
        catch (Exception e) {
            System.out.println("File is not found");
        }
    }
}
