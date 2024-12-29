package ParkingLot.gates;

import ParkingLot.managers.ParkingSpotManager;
import ParkingLot.managers.ParkingSpotManagerFactory;
import ParkingLot.models.ParkingSpot;
import ParkingLot.models.Ticket;
import ParkingLot.models.Vehicle;

public class EntranceGate {
    private ParkingSpotManagerFactory managerFactory;

    public EntranceGate(ParkingSpotManagerFactory managerFactory) {
        this.managerFactory = managerFactory;
    }

    public ParkingSpot findSpace(String vehicleType) {
        ParkingSpotManager manager = managerFactory.getParkingSpotManager(vehicleType);
        return manager.findParkingSpot();
    }

    public ParkingSpot bookSpot(Vehicle vehicle) {
        ParkingSpotManager manager = managerFactory.getParkingSpotManager(vehicle.getVehicleType());
        ParkingSpot spot = manager.findParkingSpot();
        manager.parkVehicle(vehicle, spot);
        return spot;
    }

    public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        long entryTime = System.currentTimeMillis();
        return new Ticket(entryTime, vehicle, parkingSpot);
    }
}
