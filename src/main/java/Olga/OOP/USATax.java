package Olga.OOP;

public class USATax extends Tax {
     int dependents;

     public double calcTax()
     {
         //return grossIncome*0.33/dependents;
         double result;
         if (grossIncome < 500000) result  = grossIncome*0.06;
         else if (grossIncome >500000 && (dependents ==1 || dependents == 2)) result  = grossIncome*0.1;
         else result = grossIncome*0.08;
         return result;
     }

    public double calcTax(double taxPerc, String city)
    {
        double result  = grossIncome*taxPerc/100;
        System.out.println("Tax value for " + city + " is " + result);
        return result;
    }

    public double calcTax(String city)
    {
        double taxRate = 0.09;
        double result  = grossIncome*taxRate;
        System.out.println("Tax value for " + city + " is " + result);
        return result;
    }

    public double calcTax(double taxPerc, int cityCode)
    {
        double result  = grossIncome*taxPerc/100;
        System.out.println("Tax value for city with code " + cityCode + " is " + result);
        return result;
    }


}
