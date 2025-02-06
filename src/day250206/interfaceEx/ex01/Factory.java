package day250206.interfaceEx.ex01;

public abstract class Factory {
    int openHour;        // 공장 가동시간
    int closeHour;       // 공장 종료시간
    String name;         // 공장 이름


    Factory(String name, int openHour, int closeHour){
        this.name =name;
        this.openHour = openHour;
        this.closeHour = closeHour;
    }

    public String getFactoryName() {
        return name;
    }

    public int getWorkingTime(){
        return closeHour - openHour;
    }

    abstract int makeProducts(char skill);
}
