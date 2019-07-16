package Trefilova.OOP;

public class TestCalc {

    public static void main(String[] args) {

        Calc calc = new Calc();

        System.out.println(calc.sumTwo(34, 100));
        System.out.println(calc.sumThree(1, 2, 4));
        System.out.println(calc.division(120, 4));
        System.out.println(calc.multiplication(16));
    }
}
