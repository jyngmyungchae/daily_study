package day250206.interfaceEx.ex07;

public class C implements A{

    @Override
    public void method1() {
        System.out.println("C override A method1()");
    }

    void method2 (){
        System.out.println("C method 2");
    }
}
