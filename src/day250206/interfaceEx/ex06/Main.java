package day250206.interfaceEx.ex06;

public class Main {

    public static void main(String[] args) {

        ABCImpl abcImpl = new ABCImpl();

        InterfaceA ia = abcImpl;
        ia.methodA();
        System.out.println();

        InterfaceB ib = abcImpl;
        ib.methodB();
        System.out.println();

        InterfaceC ic = abcImpl;
        ic.methodC();
        System.out.println();
    }

    //자식 인터페이스를 구현한 클래스는 자식 인터페이스의 메서드뿐만 아니라 부모 인터페이스의
    //모든 추상 메서드를 재정의해야하며 구현 객체는 자식 및 부모인터페이스 변수에 대입될 수 있다
}
