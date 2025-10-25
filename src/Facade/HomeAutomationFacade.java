package Facade;

public class HomeAutomationFacade {
    private Light light;
    private AirConditioner ac;
    private Television tv;

    public HomeAutomationFacade(Light light, AirConditioner ac, Television tv){
        this.light = light;
        this.ac = ac;
        this.tv = tv;
    }

    public void morningMode(){
        System.out.println("Setting up Morning Mode...");
        light.turnOn();
        ac.turnOn();
        ac.setTemperature(22);
        tv.turnOn();
        tv.setChannel(5);
    }

    public void nightMode(){
        System.out.println("Setting up Night Mode...");
        light.turnOff();
        ac.turnOn();
        ac.setTemperature(18);
        tv.turnOff();
    }

    public void leaveHomeMode(){
        System.out.println("Setting up Leave Home Mode...");
        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}
