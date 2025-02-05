package day250205.interfaceEx.ex01;

public class Cat extends Tail implements Animal,Pet {


    @Override
    public void play() {
        System.out.println("play cat");
    }

    @Override
    public void cry() {
        System.out.println("cry cat");
    }
}
