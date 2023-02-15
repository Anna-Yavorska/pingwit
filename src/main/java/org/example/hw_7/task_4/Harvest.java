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

    // Как правило, в программах геттеры и сеттеры задаются для всех private полей, поэтому плиз добавь те,
    // которых не хватает (если не совсем понятен запрос, можем на занятии обсудить)

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
