package day250214.lambda.ex04;

import day250214.lambda.ex04.Computer;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.action(Computer::staticMethod);
        // person.action((x,y)-> Computer.staticMethod(x,y));

        Computer computer = new Computer();
        person.action(computer::instanceMethod);
        //person.action((x,y)->computer.instanceMethod(x,y));

    }
}