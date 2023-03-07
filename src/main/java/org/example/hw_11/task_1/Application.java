package org.example.hw_11.task_1;

public class Application {
    public static void main(String[] args) {
        RotaryPhone rotaryPhone = new RotaryPhone("VEF", "TA-68");
        RadioPhone radioPhone = new RadioPhone("Panasonic", "TG6821", 400);
        MobilePhone mobilePhone = new MobilePhone("Nokia", "5310", 2, 1);
        Smartphone smartphone = new Smartphone("Xiaomi", "Redmi 10", "Android", 5000, 5);

        Phone[] phones = new Phone[]{rotaryPhone, radioPhone, mobilePhone, smartphone};
        for (Phone phone : phones) {
            System.out.println(phone);
            phone.makeCall();
            phone.receiveCall();
        }
        System.out.println("-----------------");

        AbstractPhone[] abstractPhones = new AbstractPhone[]{rotaryPhone, radioPhone, mobilePhone, smartphone};
        for (AbstractPhone phone : abstractPhones) {
            phone.adjustRingerVolume();
        }
        System.out.println("-----------------");

        System.out.println("Radio phone methods");
        radioPhone.safeNumber();
        System.out.println("Action radius: " + radioPhone.getActionRadius());

        System.out.println("Mobile phone methods");
        mobilePhone.playGame();
        System.out.println("Sim quantity: " + mobilePhone.getQuantitySim());
        System.out.println("Cameras quantity: " + mobilePhone.getQuantityCameras());

        System.out.println("Smartphone methods");
        System.out.println("System is ".concat(smartphone.getSystem()));
        System.out.println("Cameras quantity: " + smartphone.getQuantityCameras());
        System.out.println("Battery: " + smartphone.getBattery());
        smartphone.showWay();
        smartphone.readBook();
        smartphone.makeSelfie();
    }
}
