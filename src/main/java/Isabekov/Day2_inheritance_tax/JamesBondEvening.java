package Isabekov.Day2_inheritance_tax;

import static Isabekov.DAY1.Car.startEngine;
import static Isabekov.DAY1.Car.stopEngline;

public class JamesBondEvening {
    public static void main(String[] arg) {

        JamesBondCar bmw = new JamesBondCar();
        bmw.display = "JamesBond Forewer";

        bmw.color = "black";                  // почему не наследуются переменные родительского класса
        bmw.numberOfDoors = 2;
        bmw.filledWithGasoline = false;

                if (bmw.filledWithGasoline = true){
                    startEngine();
                    System.out.println(bmw.display);
                    bmw.submerge();
                } else {
                    stopEngline();
                    System.out.println("sorry");
                }
                bmw.surface();


    }
}
