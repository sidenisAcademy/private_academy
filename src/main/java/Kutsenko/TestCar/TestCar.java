package Kutsenko.TestCar;

public class TestCar {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();

        car1.color = "blue";
        car2.color = "red";

        System.out.println("The cars have been painted");

        JamesBondCar jamesBondCar = new JamesBondCar();

        jamesBondCar.color = "chameleon";
        jamesBondCar.numberOfDoors = 2;
        jamesBondCar.currentSubmergeDepth = 100;
        jamesBondCar.isGunOnBoard = false;

        jamesBondCar.startEngine();
        jamesBondCar.submerge();
        jamesBondCar.surface();
        jamesBondCar.stopEngine();
    }
}
