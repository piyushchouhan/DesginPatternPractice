package ParkingLot.managers;

import ParkingLot.models.ParkingSpot;
import ParkingLot.models.Vehicle;
import ParkingLot.strategies.ParkingStrategy;

import java.util.List;

public class ParkingSpotManager {
    private List<ParkingSpot> parkingSpots;
    private ParkingStrategy strategy;

    public ParkingSpotManager(List<ParkingSpot> parkingSpots, ParkingStrategy strategy) {
        this.parkingSpots = parkingSpots;
        this.strategy = strategy;
    }

    public ParkingSpot findParkingSpot() {
        return strategy.findSpace(parkingSpots);
    }

    public void addParkingSpot(ParkingSpot spot) {
        parkingSpots.add(spot);
    }

    public void removeParkingSpot(ParkingSpot spot) {
        parkingSpots.remove(spot);
    }

    public void parkVehicle(Vehicle vehicle, ParkingSpot spot) {
        spot.parkVehicle(vehicle);
    }

    public void removeVehicle(ParkingSpot spot) {
        spot.removeVehicle();
    }
}
