package ParkingLot.calculators;

import ParkingLot.strategies.HourlyPricingStrategy;
import ParkingLot.strategies.MinuteBasedPricingStrategy;

public class CostCalculatorFactory {
    public CostCalculator getCostCalculator(String vehicleType) {
        if (vehicleType.equals("2w")) {
            return new CostCalculator(new HourlyPricingStrategy()) {
            };
        } else if (vehicleType.equals("4w")) {
            return new CostCalculator(new MinuteBasedPricingStrategy()) {
            };
        } else {
            throw new IllegalArgumentException("Invalid vehicle type");
        }
    }
}
