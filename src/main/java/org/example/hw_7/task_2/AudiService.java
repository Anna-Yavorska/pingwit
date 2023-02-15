package org.example.hw_7.task_2;

public class AudiService {
    public static void openAudiDoors(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            // в сравнениях типа cars[i].getBrand().equals("Audi") вызов cars[i].getBrand() может вернуть null
            // и тогда мы получим NullPointerException. чтобы исключить такую вероятность, сравнивай строки так:
            // "Audi".equals(cars[i].getBrand()) - сначала то значение, которое точно не null (в данном случае "Audi")
            if (cars[i].getBrand().equals("Audi")) {
                for (int j = 1; j <= cars[i].getDoorsQuantity(); j++) {
                    System.out.println(cars[i]);
                    System.out.println("Дверь " + j + " открыта");
                }
            }
        }
    }
}

