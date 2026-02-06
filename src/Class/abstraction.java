package Class;

// Abstract class
abstract class Vehicle {

    // abstract method (no body)
    abstract void start();

    // normal method
    void fuelType() {
        System.out.println("Vehicle uses fuel");
    }
}


class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with a kick or button");
    }
}

public class abstraction {
    public static void main(String[] args) {

        Vehicle v1 = new Car();
        v1.start();        // Car starts with a key
        v1.fuelType();     // Vehicle uses fuel

        Vehicle v2 = new Bike();
        v2.start();        // Bike starts with a kick or button
    }
}



