package org.example.hw_10.task_2;

public class Car {
    private static final int SPEED_FACTOR = 20;
    private Motor motor;
    private Transmission transmission;
    // поле лучше назвать: gasPressed, gasPushed ...
    private boolean gas;
    private int speed;
    // поле лучше назвать: isMoving, isInMotion ...
    private boolean movement = false;

    public Car() {
        this.motor = new Motor();
        this.transmission = new Transmission();
    }

    public void go() {
        if (motor.isState() && transmission.isFirstGear() && gas) {
            System.out.println("Car is ride");
            movement = true;
        } else {
            System.out.println("Car can't ride");
        }
    }

    public void enginOn() {
        motor.engineOn();
    }

    public void enginOff() {
        motor.engineOff();
    }

    public void increaseGear() {
        transmission.increaseGear();
    }

    public void decreaseGear() {
        transmission.decreaseGear();
    }

    public void pressGas() {
        gas = true;
        System.out.println("Press gas");
    }

    public void printSpeed() {
        int gear = transmission.getGear();
        speed = gear * SPEED_FACTOR;
        // можно упростить условие, использую отрицание: if (!movement) {...
        if (movement == false) {
            System.out.println("Car isn't ride");
        } else {
            System.out.println("Current speed = " + speed);
        }
    }
}
