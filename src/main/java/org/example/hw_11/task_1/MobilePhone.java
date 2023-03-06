package org.example.hw_11.task_1;

public class MobilePhone extends AbstractPhone {
    private final int quantitySim;
    private final int quantityCameras;

    public MobilePhone(String type, String model, int quantitySim, int quantityCameras) {
        super(type, model);
        this.quantitySim = quantitySim;
        this.quantityCameras = quantityCameras;
    }

    public int getQuantitySim() {
        return quantitySim;
    }

    public int getQuantityCameras() {
        return quantityCameras;
    }

    @Override
    public void makeCall() {
        System.out.println("Дорогая, что нужно купить?");
    }

    @Override
    public void receiveCall() {
        System.out.println("Не могу говорить, пришли смс");
    }

    public void playGame() {
        System.out.println("Let's play in Snake");
    }

    @Override
    public void adjustRingerVolume() {
        System.out.println("Через настройки режимов. Ещё и мелодию поменять можно!");
    }

    @Override
    public String toString() {
        String string = super.toString();
        int cameras = this.getQuantityCameras();
        int sim = this.getQuantitySim();
        return string + ", quantity cameras: " + cameras + ", quantity sim: " + sim;
    }
}
