package VehicleManagement;

public class Car implements Vehicle {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public void start() {
        System.out.println("The car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("The car is stopping.");
    }

    public void honk(){
        System.out.println("Beep beep!");
    }

    public void displayInfo() {
        System.out.println("Car Model: " + model + ", Year: " + year);
    }
}
