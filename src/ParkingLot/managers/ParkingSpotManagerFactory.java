package ParkingLot.managers;

import ParkingLot.models.ParkingSpot;
import ParkingLot.strategies.ParkingStrategy;

import java.util.List;

public class ParkingSpotManagerFactory {
    private ParkingSpotManager twoWheelerManager;
    private ParkingSpotManager fourWheelerManager;

    public ParkingSpotManagerFactory(ParkingSpotManager twoWheelerManager, ParkingSpotManager fourWheelerManager) {
        this.twoWheelerManager = twoWheelerManager;
        this.fourWheelerManager = fourWheelerManager;
    }

    public ParkingSpotManager getParkingSpotManager(String vehicleType) {
        if (vehicleType.equals("2w")) {
            return twoWheelerManager; // Always returns the same instance
        } else if (vehicleType.equals("4w")) {
            return fourWheelerManager; // Always returns the same instance
        } else {
            throw new IllegalArgumentException("Invalid vehicle type");
        }
    }
}

