package day250205.interfaceEx.ex0;

public interface RemoteControlMain {

    public static void main(String[] args) {
        RemoteControl remoteControl;
        remoteControl = new TV();
        remoteControl.connectDevice();
        remoteControl.turnOn();
        remoteControl.setVolume(10);
        remoteControl.checkVolume();
        remoteControl.turnOff();

        remoteControl = new Radio();
        remoteControl.connectDevice();
        remoteControl.turnOn();
        remoteControl.setVolume(20);
        remoteControl.checkVolume();
        remoteControl.turnOff();



    }
}
