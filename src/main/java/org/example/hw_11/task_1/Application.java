package org.example.hw_11.task_1;

public class Application {
    public static void main(String[] args) {
        AbstractPhone rotaryPhone = new RotaryPhone("VEF", "TA-68");
        AbstractPhone radioPhone = new RadioPhone("Panasonic", "TG6821", 400);
        AbstractPhone mobilePhone = new MobilePhone("Nokia", "5310", 2, 1);
        AbstractPhone smartphone = new Smartphone("Xiaomi", "Redmi 10", "Android", 5000, 5);

        RadioPhone radio = new RadioPhone("Panasonic", "TG6821", 400);
        MobilePhone mobile = new MobilePhone("Nokia", "5310", 2, 1);
        Smartphone smart = new Smartphone("Xiaomi", "Redmi 10", "Android", 5000, 5);

        System.out.println(rotaryPhone);
        rotaryPhone.makeCall();
        rotaryPhone.receiveCall();
        rotaryPhone.adjustRingerVolume();
        System.out.println("========");
        System.out.println(radioPhone);
        radioPhone.makeCall();
        radioPhone.receiveCall();
        radioPhone.adjustRingerVolume();
        System.out.println("========");
        System.out.println(mobilePhone);
        mobilePhone.makeCall();
        mobilePhone.receiveCall();
        mobilePhone.adjustRingerVolume();
        System.out.println("========");
        System.out.println(smartphone);
        smartphone.makeCall();
        smartphone.receiveCall();
        smartphone.adjustRingerVolume();
        System.out.println("========");

        System.out.println("Radio phone methods");
        radio.safeNumber();
        System.out.println("Action radius: " + radio.getActionRadius());

        System.out.println("Mobile phone methods");
        mobile.playGame();
        System.out.println("Sim quantity: "+ mobile.getQuantitySim());
        System.out.println("Cameras quantity: " + mobile.getQuantityCameras());

        System.out.println("Smartphone methods");
        System.out.println("System is ".concat(smart.getSystem()));
        System.out.println("Cameras quantity: " + smart.getQuantityCameras());
        System.out.println("Battery: " + smart.getBattery());
        smart.showWay();
        smart.readBook();
        smart.makeSelfie();
    }
}
