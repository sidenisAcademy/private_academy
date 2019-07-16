package Nakhanov.OOP;

public class UsaTax extends Tax {

    int children;

    public UsaTax(double grossIncome, int children) {
        super(grossIncome);
        this.children = children;
    }

    public double taxCalc(double percentage, String city){
        System.out.println("Taxes for " + city + " = " + grossIncome * percentage);
        return grossIncome * percentage;
    }

    public double taxCalc(String city){
        System.out.println("Base tax for " + city + " is " + grossIncome * 0.13);
        return grossIncome * 0.13;
    }

    public double taxCalc(double percentage, int cityCode){
        System.out.println(grossIncome * percentage + " for city with code " + cityCode);
        return grossIncome * percentage;
    }

}
