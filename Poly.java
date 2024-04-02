class Vehicle {
    void start() {
        System.out.println("Vehicle starts...");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with ignition...");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with kick...");
    }
}

public class Poly {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start(); // Output: Car starts with ignition
        bike.start(); // Output: Bike starts with kick
    }
}
