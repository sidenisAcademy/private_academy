package Kutsenko.TestTax;

public class Tax {

    double grossIncome;
    String city;

    public double calcTax() {
        return grossIncome * 0.13;
    }
}
