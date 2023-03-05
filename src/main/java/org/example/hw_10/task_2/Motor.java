package org.example.hw_10.task_2;

public class Motor {
    private boolean turnedOn;

    public void engineOn() {
        if (turnedOn) {
            System.out.println("Engine is already on");
        } else {
            this.turnedOn = true;
            System.out.println("Engine is on");
        }
    }

    public void engineOff() {
        if (turnedOn) {
            this.turnedOn = false;
            System.out.println("Engine is off");
        } else {
            System.out.println("Engine is already off");
        }
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }
}
