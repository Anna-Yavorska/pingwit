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

    // Как правило, в программах геттеры и сеттеры задаются для всех private полей, поэтому плиз добавь те,
    // которых не хватает (если не совсем понятен запрос, можем на занятии обсудить)
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
