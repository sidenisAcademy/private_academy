package Nakhanov.OOP;


public class Main {

    public static void main(String[] args) {

        Tax tax = new Tax(1000);

        double taxCalc = tax.taxCalc();
        System.out.println(taxCalc);

        UsaTax usaTax = new UsaTax(100000, 3);

        System.out.println(usaTax.taxCalc());



    }
}
