package org.example.hw_10.task_1;

public class Application {
    public static void main(String[] args) {
        User user = new User("Богдан", "Хмельницкий", "Казак");

        Computer computer = new ComputerForWork();
        String turnOnComputer = computer.turnOn(user);
        String resetComputer = computer.reset(user);
        String turnOffComputer = computer.turnOff(user);

        Computer laptop = new Laptop();
        String turnOnLaptop = laptop.turnOn(user);
        String resetLaptop = laptop.reset(user);
        String turnOffLaptop = laptop.turnOff(user);

        Computer gameConsole = new GameConsole();
        String turnOn = gameConsole.turnOn(user);
        String reset = gameConsole.reset(user);
        String turnOff = gameConsole.turnOff(user);

        System.out.println("Computer");
        System.out.println("turnOn: " + turnOnComputer);
        System.out.println("reset: " + resetComputer);
        System.out.println("turnOff: " + turnOffComputer);
        System.out.println("Laptop");
        System.out.println("turnOn: " + turnOnLaptop);
        System.out.println("reset: " + resetLaptop);
        System.out.println("turnOff: " + turnOffLaptop);
        System.out.println("Game Console");
        System.out.println("turnOn: " + turnOn);
        System.out.println("reset: " + reset);
        System.out.println("turnOff: " + turnOff);
    }
}
