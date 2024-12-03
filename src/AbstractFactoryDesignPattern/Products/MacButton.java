package AbstractFactoryDesignPattern.Products;

import AbstractFactoryDesignPattern.Interface.Button;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Mac button");
    }
}
