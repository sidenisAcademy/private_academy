package Trefilova.OOP;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.color = "red";
        car2.color = "blue";

        System.out.println("The cars have been painted");
        System.out.println("Car1 is " + car1.color);
        System.out.println("Car2 is " + car2.color);
    }
}
