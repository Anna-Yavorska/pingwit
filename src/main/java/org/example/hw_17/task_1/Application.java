package org.example.hw_17.task_1;

import java.io.*;

public class Application {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.setBrand("Yamaha");
        motorcycle.setModel("FZ1");
        motorcycle.setEngineVolume(998);
        motorcycle.setCondition("new");

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src/main/java/org/example/hw_17/task_1/motorcycle"))){
            outputStream.writeObject(motorcycle);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/main/java/org/example/hw_17/task_1/motorcycle"));) {
            Motorcycle yamaha = (Motorcycle) objectInputStream.readObject();

            System.out.println(yamaha);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
