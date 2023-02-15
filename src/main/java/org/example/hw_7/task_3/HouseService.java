package org.example.hw_7.task_3;

public class HouseService {
    public static int quantityResidentsOfBuilding(House[] houses) {
        int quantity = 0;
        for (int i = 0; i < houses.length; i++) {
            // тут аналогично классу AudiService
            if (houses[i].getHouseType().equals("Многоэтажка")) {
                quantity += houses[i].getResidentsQuantity();
            }
        }
        System.out.print("Количество всех жителей многоэтажных домов: ");
        return quantity;
    }

    public static void printIndividualHouse(House[] houses) {
        for (int i = 0; i < houses.length; i++) {
            // тут аналогично классу AudiService
            if (houses[i].getHouseType().equals("Индивидуальный дом")) {
                System.out.println(houses[i]);
            }
        }
    }

    public static void buildingOnHeating(House[] houses) {
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getHouseType().equals("Многоэтажка") && houses[i].getFloorsQuantity() > 5) {
                houses[i].setHeatingOn(true);
                System.out.println(houses[i]);
            }
        }
    }
}
