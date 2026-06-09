package Assignment;

/**
 * Author: Sumit Vilas Awatade
 * Date: 09-Jun-2026
 */
public class Main {

    public static void main(String[] args) {

        Car car = new Car("Toyota", 80, 50);
        Bike bike = new Bike("Royal Enfield", 60, 30);
        Truck truck = new Truck("Tata Truck", 40, 30);

       
        car.displayInfo();
        System.out.println("Fuel Efficiency : " + car.calculateFuelEfficiency() + " km/l");
        System.out.println("Sound : " + car.makeSound());
        System.out.println();
        System.out.println("-----------------------------");

        
        bike.displayInfo();
        System.out.println("Fuel Efficiency : " + bike.calculateFuelEfficiency() + " km/l");
        System.out.println("Sound : " + bike.makeSound());
        System.out.println();
        System.out.println("-----------------------------");

        
        truck.displayInfo();
        System.out.println("Fuel Efficiency : " + truck.calculateFuelEfficiency() + " km/l");
        System.out.println("Sound : " + truck.makeSound());
    }
}