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
}
