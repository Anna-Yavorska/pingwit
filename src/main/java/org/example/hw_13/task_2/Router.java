package org.example.hw_13.task_2;

import org.apache.commons.lang3.RandomUtils;

import java.io.IOException;

public record Router(String name, String networkName) {
    public String connectWiFi(String deviceName) {
        String result = "";
        try {
            allowConnection();
            result = String.format("Устройство %s подключено к сети %s", deviceName, networkName);
        } catch (IOException e) {
            System.out.printf("Не удалось %s подключить к %s", deviceName, networkName);
        }
        return result;
    }

    private void allowConnection() throws IOException {
        System.out.println("Получение IP-адреса");
        if (RandomUtils.nextBoolean()) {
            System.out.println("Подключение....");
        } else {
            throw new IOException("Запрос отклонён");
        }
    }
}
