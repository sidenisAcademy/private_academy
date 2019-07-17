package Trefilova.Exceptions;

public class TryCatchRunTimeError {
    static int divideByZero() {
        try {
            return 25 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        return 90;
    }

    public static void main(String[] args) {
        System.out.println(divideByZero());
    }
}
