package chapter3;

public class Car {
    int speed;
    int distance;
    String color;

    public Car() {}

    public Car(int speed, int distance, String color) {
        this.speed = speed;
        this.distance = distance;
        this.color = color;
    }

    public void speedUp() {
        int nextSpeed = this.speed + 5;
        speed = nextSpeed > 200 ? 200 : nextSpeed;
    }

    public void breakDown() {
        int nextSpeed = this.speed - 10;
        speed = nextSpeed < 0 ? 0 : nextSpeed;
    }

    public int getCurrentSpeed() {
        return speed;
    }

    public int getCurrentDistance() {
        return distance;
    }

    public String getColor() {
        return color;
    }
}
