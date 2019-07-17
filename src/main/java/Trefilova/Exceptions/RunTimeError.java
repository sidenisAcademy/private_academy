package Trefilova.Exceptions;

public class RunTimeError {
    static int divideByZero() {
        return 25 / 0;
    }

    public static void main(String[] args) {
        divideByZero();
    }
}
