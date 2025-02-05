package day250205.interfaceEx.ex0;

public class Radio implements RemoteControl{
    int volume;

    @Override
    public void turnOff() {
        System.out.println("radio off");

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

    @Override
    public void checkVolume(){
        System.out.println("setting volume : "+this.volume);
    }

    @Override
    public void connectDevice() {
        System.out.println("connect radio");
    }

    @Override
    public void turnOn() {
        System.out.println("radio on");

    }

}
