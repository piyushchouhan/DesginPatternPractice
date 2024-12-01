package StrategyPattern;

import StrategyPattern.Strategy.CreditCardPayment;

public class Flipkart extends PaymentContext{
    public Flipkart(String cardNumber, String cardHolderName) {
        super(new CreditCardPayment(cardNumber, cardHolderName));
    }
}
