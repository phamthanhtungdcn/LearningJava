package VehicleManagement;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Car và Bike
        Car myCar = new Car("Honda Civic", 2022);
        Bike myBike = new Bike(18);

        // Gọi các phương thức của đối tượng Car
        myCar.displayInfo();
        myCar.start();
        myCar.honk();
        myCar.stop();
        System.out.println("--------------------");

        // Gọi các phương thức của đối tượng Bike
        myBike.displayInfo();
        myBike.start();
        myBike.ringBell();
        myBike.stop();
        System.out.println("--------------------");

        // Ví dụ về tính đa hình (Polymorphism)
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = myCar;
        vehicles[1] = myBike;

        System.out.println("Demonstrating Polymorphism:");
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
            vehicle.stop();
        }
    }
}
