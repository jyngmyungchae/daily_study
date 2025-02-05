package day250205.interfaceEx.ex02;

public abstract class Animal {
    private int speed;
    private double distance;

    public Animal(){}

    public Animal(int speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getSpeed() {
        return speed;
    }

    public abstract void run(int hours);
}