package Factory;

public class TruckFactory extends VehicleFactory{
    @Override
    Vehicle createVehicle(){
        return new Truck();
    }
}
