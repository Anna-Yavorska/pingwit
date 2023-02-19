package org.example.hw_6.hw_8.task_3;

public class FerryCrossingService {
    public boolean isCrossing(Car[] cars) {
        int totalWeight = 0;
        int totalQuantityPassengers = 0;
        for (int i = 0; i < cars.length; i++) {
            totalWeight += cars[i].getWeight();
            totalQuantityPassengers += cars[i].getQuantityPassengers();
        }
        return totalQuantityPassengers <= 50 && totalWeight < 15000;
    }
}
