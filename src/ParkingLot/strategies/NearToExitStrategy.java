package ParkingLot.strategies;

import ParkingLot.models.ParkingSpot;

import java.util.List;

public class NearToExitStrategy implements ParkingStrategy {
    @Override
    public ParkingSpot findSpace(List<ParkingSpot> parkingSpots) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.isEmpty()) return spot;
        }
        throw new IllegalStateException("No available spots");
    }
}
