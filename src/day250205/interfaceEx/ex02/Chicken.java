package day250205.interfaceEx.ex02;

public class Chicken extends Animal implements Cheatable{


    public Chicken(int speed) {
        super(speed);
    }

    @Override
    public void run(int hours) {
        this.setDistance(this.getDistance() + this.getSpeed());
    }

    @Override
    public void fly() {
        // fly 호출될 때마다 속도 * 2 만큼 추가 이동
        this.setDistance(this.getDistance() + this.getSpeed() * 2);
    }

}
