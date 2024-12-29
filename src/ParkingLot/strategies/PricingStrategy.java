package ParkingLot.strategies;

import ParkingLot.models.Ticket;

public interface PricingStrategy {
    double calculatePrice(Ticket ticket, long exitTime);
}
