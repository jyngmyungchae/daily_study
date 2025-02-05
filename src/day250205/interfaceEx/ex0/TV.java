package day250205.interfaceEx.ex0;

public class TV implements RemoteControl{
    int volume;

    @Override
    public void connectDevice() {
        System.out.println("connect tv");
    }

    @Override
    public void turnOn() {
        System.out.println("tv on");
    }

    @Override
    public void turnOff() {
        System.out.println("tv off");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUEM){
            this.volume = RemoteControl.MAX_VOLUEM;
            System.out.println("setting max volume");
        }else if(volume < RemoteControl.MIN_VOLUEM){
            this.volume = RemoteControl.MIN_VOLUEM;
            System.out.println("setting min volume");
        }else {
            this.volume = volume;
            System.out.println("setting "+this.volume+" volume");
        }

    }

    public void checkVolume(){
        System.out.println("setting volume : "+this.volume);
    }


}



