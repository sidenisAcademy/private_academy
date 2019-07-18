package Kutsenko.TestErrors;

public class TestErrors {

//    static int divideByZero() {
//        // Purposely dividing by zero
//        return  25 / 0;
//    }

//    public static void main(String[] args) {
//        divideByZero();
//    }

    static int divideByZero2() {
        // Purposely dividing by zero2
        return  25 / 0;
    }

    public static void main(String[] args) {
        try{
            divideByZero2();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

}
