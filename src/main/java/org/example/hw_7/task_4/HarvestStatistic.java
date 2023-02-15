package org.example.hw_7.task_4;

import java.math.BigDecimal;

// замечаний нет
public class HarvestStatistic {
    private String plant;
    private BigDecimal totalWeight;

    public HarvestStatistic() {
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }

    @Override
    public String toString() {
        return "HarvestStatistic{" +
                "plant='" + plant + '\'' +
                ", totalWeight=" + totalWeight +
                '}';
    }
}
