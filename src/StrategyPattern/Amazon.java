package StrategyPattern;

import StrategyPattern.Strategy.CreditCardPayment;

public class Amazon extends PaymentContext{
    public Amazon(String cardNumber, String cardHolderName) {
        super(new CreditCardPayment(cardNumber, cardHolderName));
    }
}
