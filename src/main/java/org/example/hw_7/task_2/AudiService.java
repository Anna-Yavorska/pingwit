package org.example.hw_7.task_2;

public class AudiService {
    public void openAudiDoors(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            if ("Audi".equals(cars[i].getBrand())) {
                for (int j = 1; j <= cars[i].getDoorsQuantity(); j++) {
                    System.out.println(cars[i]);
                    System.out.println("Дверь " + j + " открыта");
                }
            }
        }
    }
}

