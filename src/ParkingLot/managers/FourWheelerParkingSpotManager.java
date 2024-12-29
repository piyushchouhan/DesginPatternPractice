package ParkingLot.managers;

import ParkingLot.models.ParkingSpot;
import ParkingLot.strategies.ParkingStrategy;

import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager {
    public FourWheelerParkingSpotManager(List<ParkingSpot> parkingSpots, ParkingStrategy strategy) {
        super(parkingSpots, strategy);
    }
}
