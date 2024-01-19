package Polymorphism;

class Vehicle {
    public void drive() {
        System.out.println("Driving a vehicle...");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Driving a car...");
    }
}

class Truck extends Vehicle {
    public void drive() {
        System.out.println("Driving a truck...");
    }
}

public class Ex2 {
    public static void main(String[] args) {
        
        Vehicle c1 = new Car();
        c1.drive();

        Vehicle t1 = new Truck();
        t1.drive();
    }
    
}
