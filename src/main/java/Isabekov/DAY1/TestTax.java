package Isabekov.DAY1;

import sun.misc.PostVMInitHook;

public class TestTax {
    public static void main(String[] args) {
        Tax tax = new Tax();  // объявление экземпляра класса tax в новом классе
//        double grossIncome = 1000; // не стоит объявлять еще раз переменную из другого класса без присваивания значения новой переменной
//        String city = "Tomsk";
        tax.grossIncome = 1000;  // tax - это новая переменная
        tax.city = "Tomsk";
        double myTaxesInRus = tax.calcTax();  // в переменную mytaxesInRus мы записываем то, что возвращает calcTax их клааса Tsx

    //    System.out.println("My taxes is " + myTaxesInRus + " in " + tax.city);

        USATax usaTax = new USATax();

        usaTax.grossIncome = 1000;
        usaTax.city = "Dallas";
        usaTax.dependents = 10;
        double myTaxesInUsa = usaTax.calcTax();
        double studentTaz = usaTax.newCalcTax();
        String setYourName;
        String Vasya = "employee";
        String Timur = "student";
        setYourName = Vasya;


        if (setYourName == "student") {
             // тут код ссылается на calcTax из класса USATax потому тчо перменная usaTax имееет тип USATax
            System.out.println("You are a " + setYourName + " and your tax is " + studentTaz);
        } else
// поступила установка что если ты из NJ и ты студент, то тебе - 500$
            System.out.println("You are an " + setYourName + "and your tax is " + myTaxesInUsa + "in " + usaTax.city);

    }



}




