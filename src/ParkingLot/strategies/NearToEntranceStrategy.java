package ParkingLot.strategies;

import ParkingLot.models.ParkingSpot;

import java.util.List;

public class NearToEntranceStrategy implements ParkingStrategy {
    @Override
    public ParkingSpot findSpace(List<ParkingSpot> parkingSpots) {
        for (int i = parkingSpots.size() - 1; i >= 0; i--) {
            if (parkingSpots.get(i).isEmpty()) return parkingSpots.get(i);
        }
        throw new IllegalStateException("No available spots");
    }
}
