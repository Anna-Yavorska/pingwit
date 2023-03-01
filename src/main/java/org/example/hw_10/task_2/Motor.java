package org.example.hw_10.task_2;

public class Motor {
    private boolean state;

    public void engineOn() {
        if (state) {
            System.out.println("Engine is already on");
        } else {
            this.state = true;
            System.out.println("Engine is on");
        }
    }

    public void engineOff() {
        if (state) {
            this.state = false;
            System.out.println("Engine is off");
        } else {
            System.out.println("Engine is already off");
        }
    }

    public boolean isState() {
        return state;
    }
}
