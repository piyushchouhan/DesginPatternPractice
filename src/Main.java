import ObserverPattern.Observable.IphoneObservable;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertObserver;
import ObserverPattern.Observer.MobileAlertObserver;
import ObserverPattern.Observer.NotificationAlertObserver;
import StrategyPattern.Amazon;
import StrategyPattern.Flipkart;
import StrategyPattern.PaymentContext;
import StrategyPattern.SpaceX;

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

    }
}