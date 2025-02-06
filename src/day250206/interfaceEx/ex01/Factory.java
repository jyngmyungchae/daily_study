package day250206.interfaceEx.ex01;

public abstract class Factory {
    private int openHour;        // 공장 가동시간
    private int closeHour;       // 공장 종료시간
    private String name;         // 공장 이름

    Factory(String name, int openHour, int closeHour){
        this.name =name;
        this.openHour = openHour;
        this.closeHour = closeHour;
    }

    public String getFactoryName() {
        return name;
    }
    public int getWorkingTime(){
        return this.closeHour - this.openHour;
    }

    abstract int makeProducts(char skill);
}
