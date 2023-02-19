package org.example.hw_6.hw_8.task_4;

public class WarehouseMain {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(new int[]{5, 10, 15, 20, 25, 30, 35, 40});

        int next = warehouse.next(warehouse, 7);
        System.out.println(next);
    }
}
