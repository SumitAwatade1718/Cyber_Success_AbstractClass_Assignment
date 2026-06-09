package Assignment;

/**
 * Author: Sumit Vilas Awatade
 * Date: 09-Jun-2026
 */
public abstract class Vehicle {
    String brand;
    double speed;
    double fuelCapacity;

    Vehicle(String brand, double speed, double fuelCapacity) {
        this.brand = brand;
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + " | Speed: " + speed + " km/h");
    }

    abstract double calculateFuelEfficiency();

    abstract String makeSound();
}
