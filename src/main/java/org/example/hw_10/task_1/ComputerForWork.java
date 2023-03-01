package org.example.hw_10.task_1;

public class ComputerForWork implements Computer {
    @Override
    public String turnOn(User user) {
        String name = user.getName();
        String surname = user.getSurname();
        return surname + " " + name + ", Вас ждут великие дела!";
    }

    @Override
    public String turnOff(User user) {
        String name = user.getName();
        String surname = user.getSurname();
        return surname + " " + name + ", не забудьте купить жене цветы!";
    }

    @Override
    public String reset(User user) {
        String name = user.getName();
        String surname = user.getSurname();
        return surname + " " + name + ", восхищаюсь вашим трудолюбием!";
    }
}
