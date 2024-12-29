package ParkingLot.calculators;

import ParkingLot.models.Ticket;
import ParkingLot.strategies.PricingStrategy;

public abstract class CostCalculator {
    private PricingStrategy pricingStrategy;

    public CostCalculator(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculatePrice(Ticket ticket, long exitTime) {
        return pricingStrategy.calculatePrice(ticket, exitTime);
    }
}
