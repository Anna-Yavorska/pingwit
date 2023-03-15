package org.example.hw_14.task_2;

import org.apache.commons.lang3.RandomUtils;

public class Printer {
    private boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println("Принтер включён");
    }

    public void print(String document) {
        connectToPrinter();
        if (isOn) {
            System.out.println(document);
            System.out.println("Документ распечатан");
        } else {
            System.out.println("Забыли включить принтер");
            System.out.println("Идёт процесс автоматического включения...");
            turnOn();
            print(document);
        }
    }

    public void turnOff() {
        System.out.println("Принтер выключен");
    }

    private void connectToPrinter() {
        if (RandomUtils.nextBoolean()) {
            throw new PrinterOperatorException("Принтер не хочет работать!");
        }
    }
}
