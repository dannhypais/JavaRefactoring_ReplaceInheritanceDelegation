package pt.pa.refactoring.exercicio4;

public class Vehicle {
    private static final double MILES_TO_KILOMETERS = 1.60934;
    public void start() {
        System.out.println("Vehicle started");
    }

    public void stop() {
        System.out.println("Vehicle stopped");
    }

    public double calculateFuelEfficiency(double distanceInMiles, double fuelUsed) {
        double distanceInKilometers = distanceInMiles * MILES_TO_KILOMETERS;
        return distanceInKilometers / fuelUsed;
    }
}
