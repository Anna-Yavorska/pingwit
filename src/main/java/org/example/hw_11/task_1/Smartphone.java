package org.example.hw_11.task_1;

import java.util.Scanner;

public class Smartphone extends AbstractPhone {
    // если не делаешь сеттеры - делай поля final
    private String system;
    private int battery;
    private int quantityCameras;

    public Smartphone(String type, String model, String system, int battery, int quantityCameras) {
        super(type, model);
        this.system = system;
        this.battery = battery;
        this.quantityCameras = quantityCameras;
    }

    public String getSystem() {
        return system;
    }

    public int getBattery() {
        return battery;
    }

    public int getQuantityCameras() {
        return quantityCameras;
    }

    @Override
    public void makeCall() {
        System.out.println("Назовите контакт, которому хотите сделать звонок");
    }

    @Override
    public void receiveCall() {
        System.out.println("Очень быстро, а то батарея садится");
    }

    public void makeSelfie() {
        System.out.println("Фото сохранено");
    }

    public void readBook() {
        System.out.println("Какую книгу хотите почитать?");
    }

    // супер! за избретательноть ставлю лайк)
    public void showWay() {
        System.out.println("Куда едем?");
        Scanner scanner = new Scanner(System.in);
        String way = scanner.nextLine();
        System.out.printf("Маршрут %s построен", way);
        System.out.println();
    }

    @Override
    public void adjustRingerVolume() {
        System.out.println("С помощью кнопок громкости");
    }

    @Override
    public String toString() {
        String string = super.toString();
        String witchSystem = this.getSystem();
        int power = this.getBattery();
        int cameras = this.getQuantityCameras();
        return string + ", system: " + witchSystem + ", battery: " + power + "mAh, quantity cameras: " + cameras;
    }
}
