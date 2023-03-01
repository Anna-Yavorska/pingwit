package org.example.hw_10.task_1;

public class GameConsole implements Computer {
    @Override
    public String turnOn(User user) {
        String nickname = user.getNickname();
        return "Здарова " + nickname + "!";
    }

    @Override
    public String turnOff(User user) {
        String nickname = user.getNickname();
        return "Пакедава " + nickname + "!";
    }

    @Override
    public String reset(User user) {
        String nickname = user.getNickname();
        return nickname + ", погоди-ка!";
    }
}
