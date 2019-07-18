package Kutsenko.TestCalc;

public class Calc {

    void calcSum(double a, double b, double c) {
        double sum = a + b + c;
        System.out.println("Sum = " + sum);
    }

    void calcSum(double a, double b) {
        double sum = a + b;
        System.out.println("Sum = " + sum);
    }

    void calcSquare(double a) {
        double product = a * a;
        System.out.println("Product = " + product);
    }

    void calcDivide(double a, double b) {
        double divisionResult = a / b;
        System.out.println("Division result = " + divisionResult);
    }

}