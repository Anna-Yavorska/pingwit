package org.example.hw_7.task_3;

import static org.example.hw_7.task_3.HouseService.*;

public class ArrayHouse {
    public static void main(String[] args) {
        House houseLilia = new House("Многоэтажка", 6, 954, false);
        House houseViktoria = new House("Индивидуальный дом", 2, 4, true);
        House houseTolik = new House("Многоэтажка", 5, 600, false);
        House houseDavid = new House("Многоэтажка", 9, 2671, false);
        House houseGrandParents = new House("Индивидуальный дом", 1, 2, true);

        House[] houses = new House[]{houseLilia, houseViktoria, houseTolik, houseDavid, houseGrandParents};

        int quantityResidents = quantityResidentsOfBuilding(houses);
        System.out.println(quantityResidents);
        System.out.println();
        System.out.println("Все индивидуальные дома:");
        printIndividualHouse(houses);
        System.out.println();
        System.out.println("Дома в которых включили отопление:");
        buildingOnHeating(houses);
    }
}
