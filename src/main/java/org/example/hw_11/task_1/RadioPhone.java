package org.example.hw_11.task_1;

public class RadioPhone extends AbstractPhone {
    private final int actionRadius;

    public RadioPhone(String type, String model, int actionRadius) {
        super(type, model);
        this.actionRadius = actionRadius;
    }

    public int getActionRadius() {
        return actionRadius;
    }

    @Override
    public void makeCall() {
        System.out.println("Hello");
    }

    @Override
    public void receiveCall() {
        System.out.println("Где же эта трубка?");
    }

    public void safeNumber() {
        System.out.println("Контакт сохранен в телефонную книгу");
    }

    @Override
    public void adjustRingerVolume() {
        System.out.println("Через настройки трубки");
    }

    @Override
    public String toString() {
        String string = super.toString();
        int radius = this.getActionRadius();
        return string + ", action radius: " + radius;
    }
}
