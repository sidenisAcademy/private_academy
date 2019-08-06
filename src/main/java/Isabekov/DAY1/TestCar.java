package Isabekov.DAY1;

import static Isabekov.DAY1.Car.startEngine;
import static Isabekov.DAY1.Car.stopEngline;

public class TestCar {
    public static void main(String[] args){
        Car car1 = new Car();  // объявляем объект класса Car
        Car car2 = new Car();

        car1.color = "red";
        car2.color = "blue";
        car1.numberOfDoors = 4;
        car2.numberOfDoors = 2;

        System.out.println("the cars have been painted");
        System.out.println("the colour of first car is " + car1.color);
        System.out.println("the colour of second car is " + car2.color);
        System.out.println("number of doors for the 1st car is " + car1.numberOfDoors);
        System.out.println("number of doors for the 2nd car is " + car2.numberOfDoors);

//        car1.startEngine();
//        car1.stopEngline();
        startEngine();
        stopEngline();

    }
}
