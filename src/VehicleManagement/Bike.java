package VehicleManagement;

public class Bike implements Vehicle {
    private int numberOfGears;

    public Bike(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    @Override
    public void start() {
        System.out.println("The bike is being pedaled.");
    }

    @Override
    public void stop() {
        System.out.println("The bike is braking.");
    }

    public void ringBell() {
        System.out.println("Ding ding!");
    }

    public void displayInfo() {
        System.out.println("Bike with " + numberOfGears + " gears.");
    }
}
