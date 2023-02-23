package org.example.hw_9.task_2;


import java.math.BigDecimal;
import java.util.Objects;

public class Tare {
    private String name;
    private Material material;

    public Tare() {
    }

    public Tare(String name, Material material) {
        this.name = name;
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Receipt printReceipt(Tare[] tares) {
        Receipt receipt = new Receipt();
        TareService tareService = new TareService();

        int[] numbers = tareService.calculateTare(tares);
        receipt.setMessage("Вы сдали пластиковых бутылок: " + numbers[0] +
                ", стеклянных бутылок: " + numbers[1] +
                ",  алюминиевых банок: " + numbers[2]);

        BigDecimal amountInCents = new BigDecimal(numbers[3]);
        BigDecimal coefficient = new BigDecimal(100);
        receipt.setAmount(amountInCents.divide(coefficient));

        return receipt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tare tare = (Tare) o;
        return Objects.equals(name, tare.name) && material == tare.material;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, material);
    }

    @Override
    public String toString() {
        return "Tare{" +
                "name='" + name + '\'' +
                ", material=" + material +
                '}';
    }
}
