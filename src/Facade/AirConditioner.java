package Facade;

public class AirConditioner {
    public void turnOn() {
        System.out.println("AirConditioner is turned ON");
    }   
    public void turnOff() {
        System.out.println("AirConditioner is turned OFF");
    }
    public void setTemperature(int temperature) {
        System.out.println("AirConditioner temperature set to " + temperature + " degrees");
    }
}
