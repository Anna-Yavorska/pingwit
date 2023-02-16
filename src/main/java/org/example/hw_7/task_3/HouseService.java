package org.example.hw_7.task_3;

public class HouseService {
    public int quantityResidentsOfBuilding(House[] houses) {
        int quantity = 0;
        for (int i = 0; i < houses.length; i++) {
            if ("Многоэтажка".equals(houses[i].getHouseType())) {
                quantity += houses[i].getResidentsQuantity();
            }
        }
        System.out.print("Количество всех жителей многоэтажных домов: ");
        return quantity;
    }

    public void printIndividualHouse(House[] houses) {
        for (int i = 0; i < houses.length; i++) {
            if ("Индивидуальный дом".equals(houses[i].getHouseType())) {
                System.out.println(houses[i]);
            }
        }
    }

    public void buildingOnHeating(House[] houses) {
        for (int i = 0; i < houses.length; i++) {
            if ("Многоэтажка".equals(houses[i].getHouseType()) && houses[i].getFloorsQuantity() > 5) {
                houses[i].setHeatingOn(true);
                System.out.println(houses[i]);
            }
        }
    }
}
