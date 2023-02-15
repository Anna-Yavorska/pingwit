package org.example.hw_7.task_2;

public class Car {
    private String brand;
    private String model;
    private int doorsQuantity;

    public Car(String brand, String model, int doorsQuantity) {
        this.brand = brand;
        this.model = model;
        this.doorsQuantity = doorsQuantity;
    }

    public String getBrand() {
        return brand;
    }

    public int getDoorsQuantity() {
        return doorsQuantity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", doorsQuantity=" + doorsQuantity +
                '}';
    }
}
