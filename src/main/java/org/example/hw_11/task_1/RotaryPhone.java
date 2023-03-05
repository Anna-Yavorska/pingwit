package org.example.hw_11.task_1;

public class RotaryPhone extends AbstractPhone {

    public RotaryPhone(String type, String model) {
        super(type, model);
    }

    @Override
    public void adjustRingerVolume() {
        System.out.println("Не знаю как отрегулировать громкость");
    }

    @Override
    public void makeCall() {
        System.out.println("И пусть весь мир подождет!");
    }

    @Override
    public void receiveCall() {
        System.out.println("Мам, тебя к телефону");
    }
}
