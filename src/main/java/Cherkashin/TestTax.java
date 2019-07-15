package Cherkashin;

public class TestTax {
    public static void main(String[] args) {
        USATax usaTax = new USATax();
        Tax tax = new Tax();
        tax.grossIncome = 1000;
        tax.city = "Tomsk";

        double myTaxesRus = tax.calcTax();

        System.out.println("My taxes is " + myTaxesRus + " in " + tax.city);

        usaTax.grossIncome = 510000;
        usaTax.city = "NewYork";
        usaTax.dependents = 0;

        double myTaxesUsa = usaTax.calcTax();

        System.out.println("My taxes is " + myTaxesUsa + " in " + usaTax.city);

        usaTax.grossIncome = 1000;
        System.out.println(usaTax.calcTax(0.6, "NewYork"));
        System.out.println(usaTax.calcTax("NewYork"));
        System.out.println(usaTax.calcTax(0.4, 1234));
    }
}
