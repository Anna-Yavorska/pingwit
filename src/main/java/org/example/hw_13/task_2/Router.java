package org.example.hw_13.task_2;

import org.apache.commons.lang3.RandomUtils;

import java.io.IOException;
import java.util.Objects;

public class Router {
    private String name;
    private String networkName;

    public Router(String name, String networkName) {
        this.name = name;
        this.networkName = networkName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

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

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Router) obj;
        return Objects.equals(this.name, that.name) &&
                Objects.equals(this.networkName, that.networkName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, networkName);
    }

    @Override
    public String toString() {
        return "Router[" +
                "name=" + name + ", " +
                "networkName=" + networkName + ']';
    }

}
