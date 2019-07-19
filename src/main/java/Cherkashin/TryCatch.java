package Cherkashin;

public class TryCatch {
    static int divideByZero() {
        return 25 / 0;
    }

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException error) {
            System.out.println(error.getMessage());
        }
    }
}

