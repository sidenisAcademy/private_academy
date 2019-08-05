package Nakhanov.OOP;


import static Nakhanov.OOP.DoCalc.*;

public class Main {

    public static void main(String[] args) {

        Tax tax = new Tax(1000);
        double taxCalc = tax.taxCalc();
        System.out.println(taxCalc);

        UsaTax usaTax = new UsaTax(100000, 3);

        usaTax.taxCalc("Los Angeles");
        usaTax.taxCalc(0.23, "Ekaterinburg");
        usaTax.taxCalc(0.03, 5565);


        System.out.println(powerCalc(5));
        System.out.println(sumCalc(3, 5));
        System.out.println(divCalc(7.0, 5));
        System.out.println(sumCalc(4, 6, 8));

    }
}
