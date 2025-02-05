package day250205.interfaceEx.ex0;

public interface RemoteControl {

    int MAX_VOLUEM = 30;
    int MIN_VOLUEM = 0;

    void connectDevice();
    void turnOn ();
    void turnOff ();
    void setVolume(int volume);
    void checkVolume();

}
