package Isabekov.DAY1;

public class USATax extends Tax {
int dependents;
public double calcTax(){
    return grossIncome * 0.33 / dependents;
    }

    public double newCalcTax(){
    return calcTax() - 5;
    }
}
