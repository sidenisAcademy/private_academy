package Isabekov;

public class divideByZero_Isabekov {
    static int divideByZero()
    {
        // Purposely dividing by zero
        return 25/0;
    }

//    public static int divideByZero2() {
//        try {
//            return 25/0;
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//        }
//        return 10;
//    }


    public static void main(String[] args) {
//        System.out.println(divideByZero2());
        divideByZero();
        }
    }


