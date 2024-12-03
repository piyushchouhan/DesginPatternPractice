import AbstractFactoryDesignPattern.Factory.MacFactory;
import AbstractFactoryDesignPattern.Factory.WindowsFactory;
import AbstractFactoryDesignPattern.Interface.Button;
import AbstractFactoryDesignPattern.Interface.Checkbox;
import AbstractFactoryDesignPattern.Interface.UIFactory;
import DecoratorPattern.BasePizza.Pizza;
import DecoratorPattern.BasePizza.PlainPizza;
import DecoratorPattern.Toppings.Cheese;
import DecoratorPattern.Toppings.Pepperoni;
import DecoratorPattern.Toppings.Veggies;
import ObserverPattern.Observable.IphoneObservable;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertObserver;
import ObserverPattern.Observer.MobileAlertObserver;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        // region Strategy Pattern
//        PaymentContext amazon = new Amazon( "1234567890123456", "John Doe");
//        amazon.pay(1000);
//        PaymentContext flipkart = new Flipkart( "1234567890123456", "Piyush Chauhan");
//        flipkart.pay(2000);
//        PaymentContext spaceX = new SpaceX("Piyush9695@gmail.com");
//        spaceX.pay(3000);
        // endregion

        // region Observer Pattern
        StockObservable iphoneStockOberverable = new IphoneObservable();

        NotificationAlertObserver observer1 = new EmailAlertObserver("xyz@gamil.com", iphoneStockOberverable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("abc@gmail.com", iphoneStockOberverable);
        NotificationAlertObserver observer3 = new MobileAlertObserver("1234567890", iphoneStockOberverable);

        iphoneStockOberverable.add(observer1);
        iphoneStockOberverable.add(observer2);
        iphoneStockOberverable.add(observer3);

        iphoneStockOberverable.setStockCount(10);
        // endregion

        // region Decorator Pattern
        // Start with a plain pizza
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
        // endregion

        // region Factory Pattern
//        ShapeFactory shapeFactory = new ShapeFactory();
//        Shape circle = shapeFactory.getShape("circle");
//        circle.draw();
//        Shape rectangle = shapeFactory.getShape("rectangle");
//        rectangle.draw();
//        Shape square = shapeFactory.getShape("square");
//        square.draw();
        // endregion

        // region Abstract Factory Pattern
        UIFactory factory;

        // Determine platform (hardcoded here, but could be dynamic)
        String os = "Windows"; // or "MacOS"

        if (os.equalsIgnoreCase("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }

        // Use the factory to create UI components
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        // Use the created components
        button.render();        // Output: Rendering a Windows Button.
        checkbox.toggle();      // Output: Rendering a Windows Checkbox.
        // endregion


    }
}