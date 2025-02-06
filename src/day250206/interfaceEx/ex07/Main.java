package day250206.interfaceEx.ex07;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();

        action(b);
        action(c);

    }

    static void action(A a) {
        if(a instanceof C c ){
            c.method2();
        }else {
            a.method1();
        }
    }
}
