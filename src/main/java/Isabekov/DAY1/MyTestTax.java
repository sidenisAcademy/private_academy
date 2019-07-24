package Isabekov.DAY1;

public class MyTestTax {
    public static void main(String[] args) {
        MyTax myTax = new MyTax();
        double myGrossIncome = 1000;;
        String myCity = "Tomsk";
        myTax.myGrossIncome = 1000;
        myTax.myCity = "Tomsk";
        double myTaxesInRus = myTax.myCalcTax();

        System.out.println("My taxes is " + myTaxesInRus + " in " + myTax.myCity);

        MyUSATax myUsaTax = new MyUSATax();

        myUsaTax.myGrossIncome = 1000000;
        myUsaTax.myCity = "Dallas";
        myUsaTax.myDependents = 10;
        myUsaTax.myChildren = 1;
        double myTaxesInUsa = myUsaTax.myCalcTax();
        System.out.println("myTaxes is " + myTaxesInUsa +"in " + myUsaTax.myCity);

    }
}
