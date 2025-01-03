package pt.pa.refactoring.exercicio4;

public class Bicycle {
    private Vehicle vehicle;

    public Bicycle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void start() {
        vehicle.start();
    }

    public void stop() {
        vehicle.stop();
    }
    public void pedal() {
        System.out.println("Bicycle is being pedaled");
    }
}
