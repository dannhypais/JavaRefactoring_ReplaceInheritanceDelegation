package pt.pa.refactoring.exercicio4;

public class Exercicio {
    public void start() {
        System.out.println("Vehicle started");
    }

    public void stop() {
        System.out.println("Vehicle stopped");
    }

    public double calculateFuelEfficiency(double distance, double fuelUsed) {
        return distance / fuelUsed;
    }
}
/*
public class Bicycle extends Vehicle {
    public void pedal() {
        System.out.println("Bicycle is being pedaled");
    }
}*/
