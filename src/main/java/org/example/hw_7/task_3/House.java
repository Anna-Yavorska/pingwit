package org.example.hw_7.task_3;

public class House {
    private String houseType;
    private int floorsQuantity;
    private int residentsQuantity;
    private boolean isHeatingOn;

    public House(String houseType, int floorsQuantity, int residentsQuantity, boolean isHeatingOn) {
        this.houseType = houseType;
        this.floorsQuantity = floorsQuantity;
        this.residentsQuantity = residentsQuantity;
        this.isHeatingOn = isHeatingOn;
    }

    // Как правило, в программах геттеры и сеттеры задаются для всех private полей, поэтому плиз добавь те,
    // которых не хватает (если не совсем понятен запрос, можем на занятии обсудить)
    public String getHouseType() {
        return houseType;
    }

    public int getFloorsQuantity() {
        return floorsQuantity;
    }

    public int getResidentsQuantity() {
        return residentsQuantity;
    }

    public void setHeatingOn(boolean heatingOn) {
        isHeatingOn = heatingOn;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseType='" + houseType + '\'' +
                ", floorsQuantity=" + floorsQuantity +
                ", residentsQuantity=" + residentsQuantity +
                ", isHeatingOn=" + isHeatingOn +
                '}';
    }
}
