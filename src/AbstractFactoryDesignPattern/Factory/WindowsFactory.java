package AbstractFactoryDesignPattern.Factory;

import AbstractFactoryDesignPattern.Interface.Button;
import AbstractFactoryDesignPattern.Interface.Checkbox;
import AbstractFactoryDesignPattern.Interface.UIFactory;
import AbstractFactoryDesignPattern.Products.WindowsButton;
import AbstractFactoryDesignPattern.Products.WindowsCheckbox;

public class WindowsFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
