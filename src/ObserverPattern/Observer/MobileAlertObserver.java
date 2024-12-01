package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MobileAlertObserver  implements  NotificationAlertObserver{
    String mobileNo;
    StockObservable observable;

    public MobileAlertObserver(String mobileNo, StockObservable observable){
        this.mobileNo = mobileNo;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMobileAlert(mobileNo);
    }

    private void sendMobileAlert(String mobileNo){
        System.out.println("Mobile Alert sent to "+mobileNo);
    }
}
