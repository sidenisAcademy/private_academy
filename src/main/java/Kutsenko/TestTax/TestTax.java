package Kutsenko.TestTax;

public class TestTax {

    public static void main(String[] args) {
        //Rus
        Tax tax = new Tax();

        tax.grossIncome = 1000;
        tax.city = "Tomsk";

        double myTaxesInRus = tax.calcTax();

        System.out.println("My taxes is " + myTaxesInRus + " in " + tax.city);

        //USA
        USATax USATax = new USATax();

        USATax.grossIncome = 1000;
        USATax.city = "Dallas";
        USATax.dependents = 10;

        double myTaxesInUsa = USATax.calcTax();

        System.out.println("My taxes is " + myTaxesInUsa + " in " + USATax.city);

        double myTaxesInUsa1 = USATax.calcTax(0.55, "New York");
        double myTaxesInUsa2 = USATax.calcTax("Washington");
        double myTaxesInUsa3 = USATax.calcTax(0.34, 234);
    }
}
