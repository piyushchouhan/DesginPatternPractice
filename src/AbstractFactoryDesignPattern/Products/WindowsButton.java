package AbstractFactoryDesignPattern.Products;

import AbstractFactoryDesignPattern.Interface.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Windows button");
    }
}
