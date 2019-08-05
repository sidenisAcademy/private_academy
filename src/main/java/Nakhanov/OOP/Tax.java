package Nakhanov.OOP;

public class Tax {

    double grossIncome;
    String city;

    public Tax(double grossIncome) {
        this.grossIncome = grossIncome;
    }

    public double taxCalc(){

        return grossIncome * 0.13;
    }
}
