package Factory;

public class Factory {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory bikeFactory = new BikeFactory();
        VehicleFactory truckFactory = new TruckFactory();

        Vehicle car = carFactory.createVehicle();
        Vehicle bike = bikeFactory.createVehicle();
        Vehicle truck = truckFactory.createVehicle();

        System.out.println("Created a " + car.getType());
        System.out.println("Created a " + bike.getType());
        System.out.println("Created a " + truck.getType());
    }
}
