package Isabekov.DAY1;

public class TestTax {
    public static void main(String[] args) {
        Tax tax = new Tax();
        double grossIncome = 1000;;
        String city = "Tomsk";;
        tax.grossIncome = 1000;
        tax.city = "Tomsk";
        double myTaxesInRus = tax.calcTax();

        System.out.println("My taxes is " + myTaxesInRus + " in " + tax.city);

        USATax usaTax = new USATax();

        usaTax.grossIncome = 1000;
        usaTax.city = "Dallas";
        usaTax.dependents = 10;
        double myTaxesInUsa = usaTax.calcTax();
        System.out.println("myTaxes is " + myTaxesInUsa +"in " + usaTax.city);

    }
}




