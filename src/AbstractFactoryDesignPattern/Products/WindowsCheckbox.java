package AbstractFactoryDesignPattern.Products;

import AbstractFactoryDesignPattern.Interface.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void toggle() {
        System.out.println("Rendering a Windows checkbox");
    }
}
