package org.example.hw_17.task_1;

import java.io.Serializable;
import java.util.Objects;

public class Motorcycle implements Serializable {
    private String brand;
    private String model;
    private int engineVolume;

    private transient String condition;

    public Motorcycle() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motorcycle that = (Motorcycle) o;
        return engineVolume == that.engineVolume && Objects.equals(brand, that.brand) && Objects.equals(model, that.model) && Objects.equals(condition, that.condition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, condition);
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume + "cm³" +
                ", condition='" + condition + '\'' +
                '}';
    }
}
