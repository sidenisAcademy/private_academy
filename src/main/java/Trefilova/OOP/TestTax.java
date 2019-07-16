package Trefilova.OOP;

public class TestTax {
    public static void main(String[] args) {
        Tax tax = new Tax();

        tax.grossIncome = 1000;
        tax.city = "Tomsk";

        double myTaxesInRus = tax.calcTax();

        System.out.println("My taxes is " + myTaxesInRus + " in " + tax.city);

        USATax usaTax = new USATax();
        usaTax.grossIncome = 1000;
        usaTax.city = "Dallas";
        usaTax.dependents = 10;
        double myTaxesInUsa = usaTax.calcTax();

        System.out.println("My taxes is " + myTaxesInUsa + " in " + usaTax.city);

        System.out.println();

        USATax usaTax1 = new USATax();
        usaTax1.grossIncome = 1500;
        usaTax1.calcTax(0.17, "Washington");

        USATax usaTax2 = new USATax();
        usaTax2.grossIncome = 3200;
        usaTax2.calcTax("San Jose");

        USATax usaTax3 = new USATax();
        usaTax3.grossIncome = 1300;
        usaTax3.calcTax(0.23, 654038);
    }
}
