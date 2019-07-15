package Cherednik.OOP;

public class TestTax {
    public static void main(String[] args) {
        Tax tax = new Tax();
        tax.grossIncome = 1000;
        tax.city = "Tomsk";

        double myTaxesInRus = tax.calcTax();

        System.out.println(" My taxes in " + myTaxesInRus + " in " + tax.city);

        USATax usaTax = new USATax();
        usaTax.grossIncome = 1000;
        usaTax.city = "Dallas";
        usaTax.dependents = 10;
        double myTaxesInUSA = usaTax.calcTax();

        usaTax.calcTax(10, "Dallas");
        usaTax.calcTax("Dallas");
        usaTax.calcTax(10,10);
        System.out.println(" My taxes in " + myTaxesInUSA + " in " + usaTax.city);
    }
}
