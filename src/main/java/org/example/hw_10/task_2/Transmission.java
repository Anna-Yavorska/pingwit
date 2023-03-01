package org.example.hw_10.task_2;

public class Transmission {
    private static final int MIN_GEAR = 0;
    private static final int MAX_GEAR = 7;

    private int gear;

    public void increaseGear() {
        if (gear == MAX_GEAR) {
            System.out.println("Can't increase transmission gear");
        } else {
            gear++;
            System.out.println("You turn on " + gear + " gear");
        }
    }

    public void decreaseGear() {
        if (gear == MIN_GEAR) {
            System.out.println("Can't decrease transmission gear");
        } else {
            gear--;
            System.out.println("You turn on " + gear + " gear");
        }
    }

    public int getGear() {
        return gear;
    }
    public boolean isFirstGear() {
        return gear == 1;
    }
}
