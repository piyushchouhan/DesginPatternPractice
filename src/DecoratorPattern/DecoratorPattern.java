package DecoratorPattern;

import DecoratorPattern.BasePizza.Pizza;
import DecoratorPattern.BasePizza.PlainPizza;
import DecoratorPattern.Toppings.Cheese;
import DecoratorPattern.Toppings.Pepperoni;
import DecoratorPattern.Toppings.Veggies;

public class DecoratorPattern {
    public static void main(String[] args) {
        Pizza plainPizza = new PlainPizza();
        System.out.println(plainPizza.getDescription() + " Cost: $" + plainPizza.getCost());

        // Add cheese topping
        Pizza cheesePizza = new Cheese(plainPizza);
        System.out.println(cheesePizza.getDescription() + " Cost: $" + cheesePizza.getCost());

        // Add pepperoni topping
        Pizza pepperoniPizza = new Pepperoni(cheesePizza);
        System.out.println(pepperoniPizza.getDescription() + " Cost: $" + pepperoniPizza.getCost());

        // Add veggies topping
        Pizza veggiePizza = new Veggies(pepperoniPizza);
        System.out.println(veggiePizza.getDescription() + " Cost: $" + veggiePizza.getCost());
    }
}
