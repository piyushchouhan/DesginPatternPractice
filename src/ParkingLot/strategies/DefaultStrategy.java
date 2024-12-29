package ParkingLot.strategies;

import ParkingLot.models.ParkingSpot;

import java.util.List;

public class DefaultStrategy implements ParkingStrategy {
    @Override
    public ParkingSpot findSpace(List<ParkingSpot> parkingSpots) {
        return parkingSpots.stream().filter(ParkingSpot::isEmpty).findFirst()
                .orElseThrow(() -> new IllegalStateException("No available spots"));
    }
}
