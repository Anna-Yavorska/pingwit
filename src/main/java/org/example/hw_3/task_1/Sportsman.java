package org.example.hw_3.task_1;

public class Sportsman {
    public static void main(String[] args) {
        double distance = 10;
        double persent = 10;
        int days = 7;
        double totalDistance = 0;
        for (int i = 1; i < days; i++) {
            distance = distance + (distance * (persent / 100));
            totalDistance += distance;
        }
        System.out.println(totalDistance);
    }
}
