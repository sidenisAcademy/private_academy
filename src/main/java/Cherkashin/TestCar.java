package Cherkashin;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.color = "blue";
        car1.numbersOfDoors = 1;
        car2.color = "red";
        System.out.println(car1.color);
        }
}
