package org.example.hw_22.task_3;

import java.util.Objects;

public class AutoInfo {

    private final String brand;
    private final String model;
    private final int cylinderCount;
    private final float engineVolume;

    public AutoInfo(String brand, String model, int cylinderCount, float engineVolume) {
        this.brand = brand;
        this.model = model;
        this.cylinderCount = cylinderCount;
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getCylinderCount() {
        return cylinderCount;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AutoInfo autoInfo = (AutoInfo) o;
        return cylinderCount == autoInfo.cylinderCount && Float.compare(autoInfo.engineVolume, engineVolume) == 0 && Objects.equals(brand, autoInfo.brand) && Objects.equals(model, autoInfo.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, cylinderCount, engineVolume);
    }

    @Override
    public String toString() {
        return "AutoInfo{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", cylinderCount=" + cylinderCount +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
