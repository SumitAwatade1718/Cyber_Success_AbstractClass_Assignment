package Assignment;

/**
 * Author: Sumit Vilas Awatade
 * Date: 09-Jun-2026
 */
public class Truck extends Vehicle {

    Truck(String brand, double speed, double fuelCapacity) {
        super(brand, speed, fuelCapacity);
    }

    @Override
    double calculateFuelEfficiency() {
        return (fuelCapacity / speed) * 5;
    }

    @Override
    String makeSound() {
        return "Horn Blows!";
    }
}
