class Vehicle {
    int maxSpeed;
    String fuelType;

    void displayInfo() {
        System.out.println("Speed: " + maxSpeed + ", Fuel: " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;
}

class Truck extends Vehicle {
    int loadCapacity;
}

class Motorcycle extends Vehicle {
    boolean hasSidecar;
}
