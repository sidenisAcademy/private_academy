package Cherkashin;

public class Calc {


    public int sum1(int num1, int num2) {
        System.out.println("Sum 2 numbers ");
        return num1 + num2;
    }
    public int sum2(int num1, int num2, int num3) {
        System.out.println("Sum 3 numbers ");
        return num1+num2+num3;
    }
    public double div (double num1, double num2) {
        System.out.println("Division ");
        double temp =  num1 / num2;
        return temp;
    }

    public int mult (int num1) {
        System.out.println("Muliply ");
        return num1 * num1;
    }


}
