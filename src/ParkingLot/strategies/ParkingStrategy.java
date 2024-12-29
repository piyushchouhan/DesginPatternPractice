package ParkingLot.strategies;

import ParkingLot.models.ParkingSpot;

import java.util.List;

public interface ParkingStrategy {
    ParkingSpot findSpace(List<ParkingSpot> parkingSpots);
}
