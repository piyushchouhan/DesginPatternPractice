package AbstractFactoryDesignPattern.Factory;

import AbstractFactoryDesignPattern.Interface.Button;
import AbstractFactoryDesignPattern.Interface.Checkbox;
import AbstractFactoryDesignPattern.Interface.UIFactory;
import AbstractFactoryDesignPattern.Products.MacButton;
import AbstractFactoryDesignPattern.Products.MacCheckbox;

public class MacFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
