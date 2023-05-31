package org.example.hw_32.task_1;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        GravelHeap gravelHeap = new GravelHeap();
        Truck firstTruck = new Truck(gravelHeap);
        Truck secondTruck = new Truck(gravelHeap);
        Truck thirdTruck = new Truck(gravelHeap);
        Truck fourthTruck = new Truck(gravelHeap);

        firstTruck.start();
        secondTruck.start();
        thirdTruck.start();
        fourthTruck.start();

        firstTruck.join();
        secondTruck.join();
        thirdTruck.join();
        fourthTruck.join();

        System.out.println(gravelHeap.getWeight());
    }
}
