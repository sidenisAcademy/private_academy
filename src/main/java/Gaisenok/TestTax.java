package Gaisenok;

public class TestTax {
    public static void main(String[] arg) {

        Tax myTax = new Tax();
        myTax.grossIncome = 1000.0;
        myTax.city = "Tomsk";

        System.out.println("My taxes in " + myTax.city + " is " + myTax.calcTax());

        USATax usaTax = new USATax();
        usaTax.dependents=3;
        usaTax.grossIncome=700000;
        usaTax.city="Dallas";
        System.out.println("My taxes in " + usaTax.city + " is " + usaTax.calcTax());

        USATax usTax1 = new USATax();
        usTax1.calcTax(0.56, "Denver");
        usTax1.calcTax("Denver");
        usTax1.calcTax(0.23,12345);
    }
}