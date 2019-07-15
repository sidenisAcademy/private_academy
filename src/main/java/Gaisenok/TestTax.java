package Gaisenok;

public class TestTax {
    public static void main(String[] arg) {

        Tax myTax = new Tax();
        myTax.grossIncome = 1000.0;
        myTax.city = "Tomsk";

        System.out.println("My taxes in " + myTax.city + " is " + myTax.calcTax());

        USATax usaTax = new USATax();
        usaTax.dependents=3;
        usaTax.grossIncome=800000;
        usaTax.city="Dallas";
        System.out.println("My taxes in " + usaTax.city + " is " + usaTax.calcTax());
    }
}
