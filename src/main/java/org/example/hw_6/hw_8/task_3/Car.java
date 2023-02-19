package org.example.hw_6.hw_8.task_3;

public class Car {
    private String governmentNumber;
    private CarType carType;
    private int quantityPassengers;
    private int weight;

    public Car(String governmentNumber, CarType carType, int quantityPassengers, int weight) {
        this.governmentNumber = governmentNumber;
        this.carType = carType;
        this.quantityPassengers = quantityPassengers;
        this.weight = weight;
    }

    public String getGovernmentNumber() {
        return governmentNumber;
    }

    public void setGovernmentNumber(String governmentNumber) {
        this.governmentNumber = governmentNumber;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getQuantityPassengers() {
        return quantityPassengers;
    }

    public void setQuantityPassengers(int quantityPassengers) {
        this.quantityPassengers = quantityPassengers;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "governmentNumber='" + governmentNumber + '\'' +
                ", carType=" + carType +
                ", quantityPassengers=" + quantityPassengers +
                ", weight=" + weight +
                '}';
    }
}
