package Cherkashin;

public class TestTax {
    public static void main(String[] args) {
        Tax tax = new Tax();
        tax.grossIncome = 1000;
        tax.city = "Tomsk";

        double myTaxesRus = tax.calcTax();

        System.out.println("My taxes is " + myTaxesRus + " in " + tax.city);

        USATax usaTax = new USATax();
        usaTax.grossIncome = 510000;
        usaTax.city = "NewYork";
        usaTax.dependents = 0;

        double myTaxesUsa = usaTax.calcTax();

        System.out.println("My taxes is " + myTaxesUsa + " in " + usaTax.city);
    }
}
