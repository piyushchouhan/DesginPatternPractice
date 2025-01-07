package AbstractFactoryDesignPattern;

import AbstractFactoryDesignPattern.Factory.MacFactory;
import AbstractFactoryDesignPattern.Factory.WindowsFactory;
import AbstractFactoryDesignPattern.Interface.Button;
import AbstractFactoryDesignPattern.Interface.Checkbox;
import AbstractFactoryDesignPattern.Interface.UIFactory;

public class AbstractFactory {
    public static void main(String[] args) {
        UIFactory factory;

        // Determine platform (hardcoded here, but could be dynamic)
        String os = "Windows"; // or "MacOS"

        if (os.equalsIgnoreCase("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }

        // Use the factory to create UI components
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        // Use the created components
        button.render();        // Output: Rendering a Windows Button.
        checkbox.toggle();      // Output: Rendering a Windows Checkbox.
    }
}
