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

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public int getFloorsQuantity() {
        return floorsQuantity;
    }

    public void setFloorsQuantity(int floorsQuantity) {
        this.floorsQuantity = floorsQuantity;
    }

    public int getResidentsQuantity() {
        return residentsQuantity;
    }

    public void setResidentsQuantity(int residentsQuantity) {
        this.residentsQuantity = residentsQuantity;
    }

    public boolean isHeatingOn() {
        return isHeatingOn;
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
