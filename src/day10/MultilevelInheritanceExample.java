package day10;

class Vehicle{
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle{
    void drive() {
        System.out.println("Car is driving...");
    }
}

class ElectricCar extends Car{
    void charge() {
        System.out.println("Electric car is charging...");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        ElectricCar myCar = new ElectricCar();
        myCar.start();
        myCar.drive();
        myCar.charge();
    }
}
