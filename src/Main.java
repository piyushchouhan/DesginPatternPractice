import ObserverPattern.Observable.IphoneObservable;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertObserver;
import ObserverPattern.Observer.MobileAlertObserver;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable iphoneStockOberverable = new IphoneObservable();

        NotificationAlertObserver observer1 = new EmailAlertObserver("xyz@gamil.com", iphoneStockOberverable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("abc@gmail.com", iphoneStockOberverable);
        NotificationAlertObserver observer3 = new MobileAlertObserver("1234567890", iphoneStockOberverable);

        iphoneStockOberverable.add(observer1);
        iphoneStockOberverable.add(observer2);
        iphoneStockOberverable.add(observer3);

        iphoneStockOberverable.setStockCount(10);

    }
}