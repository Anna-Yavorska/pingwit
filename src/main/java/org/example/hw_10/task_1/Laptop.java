package org.example.hw_10.task_1;

public class Laptop implements Computer {
    @Override
    public String turnOn(User user) {
        String name = user.getName();
        return "Добро пожаловать, " + name;
    }

    @Override
    public String turnOff(User user) {
        String name = user.getName();
        return "До встречи, " + name;
    }

    @Override
    public String reset(User user) {
        String name = user.getName();
        return "Ноутбук будет перезагружен. " + name + ", вы уверены?";
    }
}
