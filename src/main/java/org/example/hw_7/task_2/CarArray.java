package org.example.hw_7.task_2;

import static org.example.hw_7.task_2.AudiService.openAudiDoors;

// Отлично!
public class CarArray {
    public static void main(String[] args) {

        Car audiOne = new Car("Audi", "Q5", 5);
        Car mazda = new Car("Mazda", "CX-5", 5);
        Car audiTwo = new Car("Audi", "RS4", 5);
        Car zaporozhets = new Car("Zaporozhets", "ZAZ-968M", 2);
        Car audiThree = new Car("Audi", "TT", 2);

        Car[] cars = new Car[]{audiOne, mazda, audiTwo, zaporozhets, audiThree};

        // Уточню условие: я хотел бы, чтобы метод openAudiDoors не был статическим.
        // То есть вызывать его нужно на ОБЪЕКТЕ типа AudiService
        openAudiDoors(cars);
    }
}
