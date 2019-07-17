package Nakhanov.Exceptions;

import java.io.File;
import java.io.IOException;

import static Nakhanov.Exceptions.ExceptionsTest.openFile;
import static Nakhanov.Exceptions.ExceptionsTest.openFile1;

public class Main {

    static int divideByZero() {
    // Purposely dividing by zero
        return 25/0;
    }

    static int divideByZero1(){
        // Purposely dividing by zero
        try {
            return divideByZero();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        return 0;

    }


    public static void main(String[] args) {
        divideByZero1();

        File file = new File("C:\\Users\\vitalii.nakhanov\\" +
                "IdeaProjects\\privat_academy\\src\\main\\" +
                "resources\\ololo.txt");
        try {
            openFile(file);
        }
        catch(IOException e) {
            System.out.println("Error " + e.getLocalizedMessage());
        }


        openFile1(file);

    }

}
