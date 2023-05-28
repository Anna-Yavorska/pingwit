package org.example.hw_32.task_1;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        GravelHeap gravelHeap = new GravelHeap();
        Truck firstTruck = new Truck(gravelHeap);
        Truck secondTruck = new Truck(gravelHeap);
        Truck thirdTruck = new Truck(gravelHeap);
        Truck fourthTruck = new Truck(gravelHeap);

        firstTruck.start();
        firstTruck.join();

        secondTruck.start();
        secondTruck.join();

        thirdTruck.start();
        thirdTruck.join();

        fourthTruck.start();
        fourthTruck.join();

        System.out.println(gravelHeap.getWeight());
    }
}
