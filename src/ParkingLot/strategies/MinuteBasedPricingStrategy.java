package ParkingLot.strategies;

import ParkingLot.models.Ticket;

public class MinuteBasedPricingStrategy implements PricingStrategy{
    public double calculatePrice(Ticket ticket, long exitTime) {
        long duration = (exitTime - ticket.getEntryTime()) / 60; // in minutes
        return duration * (ticket.getParkingSpot().getPrice() / 60);
    }
}
