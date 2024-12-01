package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{

    String emailId;
    StockObservable observable;

    public EmailAlertObserver(String emailId, StockObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(emailId);
    }

    private void sendEmail(String emailId){
        System.out.println("Email sent to "+emailId);
    }
}
