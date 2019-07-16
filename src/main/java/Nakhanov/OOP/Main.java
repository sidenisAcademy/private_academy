package Nakhanov.OOP;



public class Main {

    public static void main(String[] args) {

        Tax tax = new Tax(1000);
        double taxCalc = tax.taxCalc();
        System.out.println(taxCalc);

        UsaTax usaTax = new UsaTax(100000, 3);

        usaTax.taxCalc("Los Angeles");
        usaTax.taxCalc(0.23,"Ekaterinburg");
        usaTax.taxCalc(0.03, 5565);


    }
}
