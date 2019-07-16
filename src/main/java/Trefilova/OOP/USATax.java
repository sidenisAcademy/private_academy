package Trefilova.OOP;

public class USATax extends Tax {

    int dependents;

    public double calcTax() {
        if(grossIncome <= 200000) {
            return grossIncome * 0.06;
        } else if (grossIncome > 200000 && (dependents == 2 || dependents == 1)) {
            return grossIncome * 0.1;
        }
        else {
            return grossIncome * 0.08;
        }
    }

    public double calcTax(double tax, String city) {
        System.out.println("Taxes for " + city + " is " + grossIncome * tax);
        return grossIncome * tax;
    }

    public double calcTax(String city) {
        System.out.println("Taxes for " + city + " is " + grossIncome * 0.09);
        return grossIncome * 0.09;
    }

    public double calcTax(double tax, int code) {
        System.out.println("Taxes for city with code " + code + " is " + grossIncome * tax);
        return grossIncome * tax;
    }
}
