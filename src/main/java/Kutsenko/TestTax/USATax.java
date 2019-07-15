package Kutsenko.TestTax;

public class USATax extends Tax {
    int dependents;

    public double calcTax() {
        if (grossIncome <= 500000) {
            return grossIncome * 0.06;
        } else if ((grossIncome > 500000) && dependents <= 2 && dependents > 0) {
            return grossIncome * 0.1;
        } else {
            return grossIncome * 0.08;
        }
    }

    public double calcTax(double taxPercentage, String city) {
        double myTaxesInUsa = grossIncome * taxPercentage;
        System.out.println("My taxes is " + myTaxesInUsa + " in " + city);
        return myTaxesInUsa;
    }

    public double calcTax(String city) {
        double myTaxesInUsa = grossIncome * 0.66;
        System.out.println("My taxes is " + myTaxesInUsa + " in " + city);
        return myTaxesInUsa;
    }

    public double calcTax(double taxPercentage, int cityCode) {
        double myTaxesInUsa = grossIncome * taxPercentage;
        System.out.println("My taxes is " + myTaxesInUsa + " in " + cityCode);
        return myTaxesInUsa;
    }
}
