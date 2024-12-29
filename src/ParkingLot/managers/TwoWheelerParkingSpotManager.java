package ParkingLot.managers;

import ParkingLot.models.ParkingSpot;
import ParkingLot.strategies.ParkingStrategy;

import java.util.List;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager {
    public TwoWheelerParkingSpotManager(List<ParkingSpot> parkingSpots, ParkingStrategy strategy) {
        super(parkingSpots, strategy);
    }
}
