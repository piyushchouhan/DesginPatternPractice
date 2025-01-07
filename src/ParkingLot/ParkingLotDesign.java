package ParkingLot;

import ParkingLot.calculators.CostCalculatorFactory;
import ParkingLot.gates.EntranceGate;
import ParkingLot.gates.ExitGate;
import ParkingLot.managers.FourWheelerParkingSpotManager;
import ParkingLot.managers.ParkingSpotManager;
import ParkingLot.managers.ParkingSpotManagerFactory;
import ParkingLot.managers.TwoWheelerParkingSpotManager;
import ParkingLot.models.*;
import ParkingLot.strategies.DefaultStrategy;
import ParkingLot.strategies.NearToEntranceStrategy;
import ParkingLot.strategies.NearToExitStrategy;
import ParkingLot.strategies.ParkingStrategy;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotDesign {
    public static void main(String[] args) {
        List<ParkingSpot> parkingSpots = new ArrayList<>();
        parkingSpots.add(new TwoWheelerParkingSpot(1, 5.0));
        parkingSpots.add(new TwoWheelerParkingSpot(2, 5.0));
        parkingSpots.add(new FourWheelerParkingSpot(3, 10.0));
        parkingSpots.add(new FourWheelerParkingSpot(4, 10.0));

        // Creating parking strategies
        ParkingStrategy nearToEntranceStrategy = new NearToEntranceStrategy();
        ParkingStrategy nearToExitStrategy = new NearToExitStrategy();
        ParkingStrategy defaultStrategy = new DefaultStrategy();

        // Creating Parking Spot Managers
        ParkingSpotManager twoWheelerManager = new TwoWheelerParkingSpotManager(parkingSpots, nearToEntranceStrategy);
        ParkingSpotManager fourWheelerManager = new FourWheelerParkingSpotManager(parkingSpots, nearToExitStrategy);

        // Creating Manager Factory
        ParkingSpotManagerFactory managerFactory = new ParkingSpotManagerFactory(twoWheelerManager, fourWheelerManager);

        // Creating Cost Calculators
        CostCalculatorFactory costCalculatorFactory = new CostCalculatorFactory();

        // Creating Entrance and Exit gates
        EntranceGate entranceGate = new EntranceGate(managerFactory);
        ExitGate exitGate = new ExitGate(costCalculatorFactory, managerFactory);

        // Creating vehicles
        Vehicle bike = new Vehicle("BIKE001", "2w");
        Vehicle car = new Vehicle("CAR001", "4w");

        // Vehicle entering
        System.out.println("Parking Bike...");
        ParkingSpot bikeSpot = entranceGate.bookSpot(bike);
        Ticket bikeTicket = entranceGate.generateTicket(bike, bikeSpot);
        System.out.println("Bike parked at spot: " + bikeSpot.getId());

        System.out.println("\nParking Car...");
        ParkingSpot carSpot = entranceGate.bookSpot(car);
        Ticket carTicket = entranceGate.generateTicket(car, carSpot);
        System.out.println("Car parked at spot: " + carSpot.getId());

        // Vehicle exiting and payment
        System.out.println("\nCar is exiting...");
        double carPrice = exitGate.calculatePrice(carTicket);
        exitGate.processPayment(carPrice, "Credit Card");
        exitGate.removeVehicle(carTicket);
        System.out.println("Car has exited, price: " + carPrice);

        System.out.println("\nBike is exiting...");
        double bikePrice = exitGate.calculatePrice(bikeTicket);
        exitGate.processPayment(bikePrice, "Debit Card");
        exitGate.removeVehicle(bikeTicket);
        System.out.println("Bike has exited, price: " + bikePrice);

    }
}
