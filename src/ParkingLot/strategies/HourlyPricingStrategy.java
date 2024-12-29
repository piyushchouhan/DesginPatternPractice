package ParkingLot.strategies;

import ParkingLot.models.Ticket;

public class HourlyPricingStrategy implements PricingStrategy{
    @Override
    public double calculatePrice(Ticket ticket, long exitTime) {
        long duration = (exitTime - ticket.getEntryTime()) / 3600; // in hours
        return duration * ticket.getParkingSpot().getPrice();
    }
}
