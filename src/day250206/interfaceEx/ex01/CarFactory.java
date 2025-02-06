package day250206.interfaceEx.ex01;

import com.sun.source.tree.IfTree;

public class CarFactory extends Factory implements IWorkingTogether{

    CarFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    @Override
    int makeProducts(char skill) {
        if(skill=='A'){
            return 3 * getWorkingTime();
        } else if(skill=='B'){
            return 2 * getWorkingTime();
        } else if(skill=='C'){
            return getWorkingTime();
        } else {
            return 0;
        }
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return makeProducts('B');
    }
}
