package Cherednik.OOP;

public class USATax extends Tax {

    int dependents;

    public double calcTax() {
        //return grossIncome * 0.33 / dependents;
        if (grossIncome <= 500000) {
            return grossIncome * 0.06;
        } else if (grossIncome > 500000 && dependents <= 2 && dependents > 0) {
            return grossIncome * 0.10;
        } else {
            System.out.println("Your taxes is 10 %");
            return grossIncome * 0.8;
        }
    }

    public double calcTax(double taxRate, String city) {
        System.out.println("City = " + city);
        return grossIncome * taxRate;
    }

    public double calcTax(String city) {
        System.out.println("City = " + city);
        return grossIncome * 0.8;
    }

    public double calcTax(double taxRate, int code) {
        System.out.println("City = " + code);
        return grossIncome * taxRate;
    }
}
