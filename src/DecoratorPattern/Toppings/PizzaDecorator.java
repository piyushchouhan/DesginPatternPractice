package DecoratorPattern.Toppings;

import DecoratorPattern.BasePizza.Pizza;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza; // Composition: wrap a Pizza object

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}
