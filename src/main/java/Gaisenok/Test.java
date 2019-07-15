package Gaisenok;

import Gaisenok.Car;

public class Test {

    public static void main (String[] arg){

        Car car1 = new Car();
        Car car2 = new Car();

        car1.color="blue";

        car2.numberOfDoors=3;
        car1.startEngine();
        car1.stopEngine();
    }

}
