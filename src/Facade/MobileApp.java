package Facade;

public class MobileApp {
    public static void main(String[] args){
        // Creating the subsystems
        Light light = new Light();
        AirConditioner ac = new AirConditioner();
        Television tv = new Television();

        // Creating the Facade
        HomeAutomationFacade homeFacade = new HomeAutomationFacade(light, ac, tv);

        // Using the Facade to set different modes
        homeFacade.morningMode();
        homeFacade.nightMode();
        homeFacade.leaveHomeMode();
    }
}
