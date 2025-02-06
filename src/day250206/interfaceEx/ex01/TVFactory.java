package day250206.interfaceEx.ex01;

public class TVFactory extends Factory implements IWorkingTogether{

    TVFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    @Override
    int makeProducts(char skill) {
        if(skill=='A'){
            return 8 * getWorkingTime();
        } else if(skill=='B'){
            return 5 * getWorkingTime();
        } else if(skill=='C'){
            return 3 * getWorkingTime();
        } else {
            return getWorkingTime();
        }

    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return makeProducts('C');
    }
}
