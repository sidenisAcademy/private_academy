package Nakhanov.OOP;

public class UsaTax extends Tax {

    int children;

    public UsaTax(double grossIncome, int children) {
        super(grossIncome);
        this.children = children;
    }

    public double taxCalc(){

        if (grossIncome <= 500000){
            return grossIncome * 0.06;
        }
        else if (grossIncome > 500000 && children <=2 && children > 0){
            return grossIncome * 0.1;
        }
        else return grossIncome * 0.08;
    }



    public void doSomething(UsaTax tax){
        System.out.println(tax.children);
    }
}
