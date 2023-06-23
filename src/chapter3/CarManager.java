package chapter3;

public class CarManager {
    public static void main(String[] args) {
        Car firstCar = new Car();
        firstCar.speedUp();
        firstCar.speedUp();
        System.out.println("firstCar.getCurrentSpeed() = " + firstCar.getCurrentSpeed());
        firstCar.breakDown();
        System.out.println("firstCar.getCurrentSpeed() = " + firstCar.getCurrentSpeed());
        firstCar.breakDown();
        System.out.println("firstCar.getCurrentSpeed() = " + firstCar.getCurrentSpeed());
    }
}
