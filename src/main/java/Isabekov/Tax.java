package Isabekov;

public class Tax {
    double grossIncome;
    String city;
    Integer test;

    public double calcTax() {
        return grossIncome * 0.13;
    }
}
