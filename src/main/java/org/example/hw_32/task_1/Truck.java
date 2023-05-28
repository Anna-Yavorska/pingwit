package org.example.hw_32.task_1;

public class Truck extends Thread {
    private final GravelHeap gravelHeap;

    public Truck(GravelHeap gravelHeap) {
        this.gravelHeap = gravelHeap;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1250; i++) {
            gravelHeap.increase(2);
            System.out.println("Привез 2 тонны");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
