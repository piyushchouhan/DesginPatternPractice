package StrategyPattern;

import StrategyPattern.Strategy.PayPalPayment;

public class SpaceX extends PaymentContext{
    public SpaceX(String email) {
        super(new PayPalPayment(email));
    }
}
