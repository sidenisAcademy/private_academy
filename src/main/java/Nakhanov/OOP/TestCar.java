package Nakhanov.OOP;

public class TestCar {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();

        car1.color = "Red";
        car2.color = "The best color";

        car1.startEngine();

        car2.startEngine();
        car1.stopEngine();
    }
}
