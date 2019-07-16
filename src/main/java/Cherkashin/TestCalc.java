package Cherkashin;

public class TestCalc {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println("Result of Sum (2 numbers) = " + calc.sum1(1, 2));
        System.out.println("Result of Sum (3 numbers) = " + calc.sum2(1, 2, 3));
        System.out.println("Result of Division = " + calc.div(10, 3));
        System.out.println("Result of Multipy = " + calc.mult(5));

    }
}

