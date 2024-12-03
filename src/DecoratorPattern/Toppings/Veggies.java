package DecoratorPattern.Toppings;

import DecoratorPattern.BasePizza.Pizza;

public class Veggies extends PizzaDecorator {
    public Veggies(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Veggies";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.00;
    }
}
