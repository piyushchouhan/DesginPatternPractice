import StrategyPattern.Amazon;
import StrategyPattern.Flipkart;
import StrategyPattern.PaymentContext;
import StrategyPattern.SpaceX;
import StrategyPattern.Strategy.CreditCardPayment;
import StrategyPattern.Strategy.PayPalPayment;

public class Main {
    public static void main(String[] args) {
        PaymentContext amazon = new Amazon( "1234567890123456", "John Doe");
        amazon.pay(1000);
        PaymentContext flipkart = new Flipkart( "1234567890123456", "Piyush Chauhan");
        flipkart.pay(2000);
        PaymentContext spaceX = new SpaceX("Piyush9695@gmail.com");
        spaceX.pay(3000);

    }
}