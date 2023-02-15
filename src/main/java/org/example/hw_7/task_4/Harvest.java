package org.example.hw_7.task_4;

import java.math.BigDecimal;

public class Harvest {
    private long id;
    private String field;
    private String plant;
    private BigDecimal weight;

    public Harvest(long id, String field, String plant, BigDecimal weight) {
        this.id = id;
        this.field = field;
        this.plant = plant;
        this.weight = weight;
    }

    public String getPlant() {
        return plant;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Harvest{" +
                "id=" + id +
                ", field='" + field + '\'' +
                ", plant='" + plant + '\'' +
                ", weight=" + weight +
                '}';
    }
}
