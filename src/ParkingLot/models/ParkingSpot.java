package ParkingLot.models;

public class ParkingSpot {
    private int id;
    private boolean isEmpty = true;
    private Vehicle vehicle;
    private double price;

    public ParkingSpot(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public double getPrice() {
        return price;
    }

    public void parkVehicle(Vehicle vehicle) {
        if (!isEmpty) throw new IllegalStateException("Spot already occupied");
        this.vehicle = vehicle;
        this.isEmpty = false;
    }

    public void removeVehicle() {
        if (isEmpty) throw new IllegalStateException("Spot is already empty");
        this.vehicle = null;
        this.isEmpty = true;
    }
}
