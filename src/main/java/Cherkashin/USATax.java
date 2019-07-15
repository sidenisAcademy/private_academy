package Cherkashin;

public class USATax extends Tax {
    int dependents;

    public double calcTax() {
        if (grossIncome <= 500000) {
            return grossIncome * 0.06;
            }
        else if ( grossIncome <= 500000 && dependents == 2 || dependents == 1) {
            return  grossIncome * 0.1;
            }
        else return grossIncome * 0.08;

    }
    public double calcTax(double taxRate, String city) {
        System.out.println("First method: " + city);
        return grossIncome * taxRate;
    }
    public double calcTax(String city) {
        System.out.println("Second method: " + city);
        return grossIncome*0.33;
    }
    public double calcTax(double taxRate, int cityCode) {
        System.out.println("Third method: " + cityCode + " and " + taxRate);
        return  grossIncome* taxRate;
    }
}
