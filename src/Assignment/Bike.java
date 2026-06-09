package Assignment;

/**
 * Author: Sumit Vilas Awatade
 * Date: 09-Jun-2026
 */
public class Bike extends Vehicle {

    Bike(String brand, double speed, double fuelCapacity) {
        super(brand, speed, fuelCapacity);
    }

    @Override
    double calculateFuelEfficiency() {
        return (fuelCapacity / speed) * 15;
    }

    @Override
    String makeSound() {
        return "Vroom Vroom";
    }
}
