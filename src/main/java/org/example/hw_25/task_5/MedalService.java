package org.example.hw_25.task_5;

import org.example.hw_25.task_5.Medal;
import org.example.hw_25.task_5.Sportsman;

import java.util.List;

public class MedalService {
    public void reward(List<Sportsman> sportsmen) {
        sportsmen.get(0).getMedals().add(0, Medal.GOLD);
        System.out.println("First place: " + sportsmen.get(0));
        sportsmen.get(1).getMedals().add(0, Medal.SIlVER);
        System.out.println("Second place: " + sportsmen.get(1));
        sportsmen.get(2).getMedals().add(0, Medal.BRONZE);
        System.out.println("Third place: " + sportsmen.get(2));
    }
}
