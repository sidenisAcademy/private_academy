package Gaisenok;

public class CalcTest {
    public static void main(String[] arg) {
        Calc calc1 = new Calc();

        System.out.println(calc1.addNumbers(5,7));
        System.out.println(calc1.addNumbers(5,7, 8));
        System.out.println(calc1.numbersDivision(12,4));
        System.out.println(calc1.numberMultiplyItself(7));
    }
}
