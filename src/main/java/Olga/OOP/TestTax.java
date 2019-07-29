package Olga.OOP;

public class TestTax {

    public static void main(String[] args) {
        Tax tax = new Tax();
        tax.grossIncome = 1000;
        tax.city = "Tomsk";

        double myRusTax = tax.caclTax();
        //System.out.println("Tax value for city " + tax.city + " is " + myRusTax);


        USATax usaTax = new USATax();
        usaTax.grossIncome = 5000000;
        usaTax.dependents = 3;
        usaTax.city = "New York";

        //System.out.println("USA local tax for " + usaTax.city + " is " + usaTax.calcTax());

        double tax1 = usaTax.calcTax("Los Angeles");
        double tax2 = usaTax.calcTax(10, "Boston");
        double tax3 = usaTax.calcTax(30, 45678);


    }
}
