package AbstractFactoryDesignPattern.Products;

import AbstractFactoryDesignPattern.Interface.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void toggle() {
        System.out.println("Rendering a Mac checkbox");
    }
}
