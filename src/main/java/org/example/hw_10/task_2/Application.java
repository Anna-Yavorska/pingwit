package org.example.hw_10.task_2;

public class Application {
    public static void main(String[] args) {
        Car car = new Car();
        car.enginOn();
        car.increaseGear();
        car.pressGas();
        car.go();
        car.printSpeed();

        car.enginOn();
        car.increaseGear();
        car.printSpeed();
        car.decreaseGear();
        car.printSpeed();
        car.enginOff();
        car.go();
        car.enginOff();
    }
}
