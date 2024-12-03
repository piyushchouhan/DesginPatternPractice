package DecoratorPattern.BasePizza;

public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 5.00; // Base cost of a plain pizza
    }
}
