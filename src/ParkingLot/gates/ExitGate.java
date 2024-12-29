package ParkingLot.gates;

import ParkingLot.calculators.CostCalculator;
import ParkingLot.managers.ParkingSpotManager;
import ParkingLot.calculators.CostCalculatorFactory;
import ParkingLot.managers.ParkingSpotManagerFactory;
import ParkingLot.models.Ticket;

public class ExitGate {

    private CostCalculatorFactory costCalculatorFactory;
    private ParkingSpotManagerFactory managerFactory;

    public ExitGate(CostCalculatorFactory costCalculatorFactory, ParkingSpotManagerFactory managerFactory) {
        this.costCalculatorFactory = costCalculatorFactory;
        this.managerFactory = managerFactory;
    }

    public double calculatePrice(Ticket ticket) {
        long exitTime = System.currentTimeMillis();
        CostCalculator calculator = costCalculatorFactory.getCostCalculator(ticket.getVehicle().getVehicleType());
        return calculator.calculatePrice(ticket, exitTime);
    }

    public void processPayment(double amount, String paymentMethod) {
        System.out.println("Payment of " + amount + " received via " + paymentMethod);
    }

    public void removeVehicle(Ticket ticket) {
        ParkingSpotManager manager = managerFactory.getParkingSpotManager(ticket.getVehicle().getVehicleType());
        manager.removeVehicle(ticket.getParkingSpot());
    }
}
