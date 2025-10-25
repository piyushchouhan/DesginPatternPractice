package Facade;

public class Television {
    public void turnOn() {
        System.out.println("Television is turned ON");
    }
    public void turnOff() {
        System.out.println("Television is turned OFF");
    }
    public void setChannel(int channel) {
        System.out.println("Television channel set to " + channel);
    }
}
