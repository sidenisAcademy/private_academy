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
}
