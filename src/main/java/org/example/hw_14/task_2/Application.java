package org.example.hw_14.task_2;

public class Application {
    public static void main(String[] args) {
        Printer printer = new Printer();
        String document = "Курсовая работа";
        try {
            printer.print(document);
        } finally {
            printer.turnOff();
        }
    }
}
