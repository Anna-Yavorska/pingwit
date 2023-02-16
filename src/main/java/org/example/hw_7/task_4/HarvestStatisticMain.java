package org.example.hw_7.task_4;

import java.math.BigDecimal;

public class HarvestStatisticMain {
    public static void main(String[] args) {
        HarvestStatisticService harvestStatisticService = new HarvestStatisticService();

        Harvest firstField = new Harvest(1, "Field with vegetables", "Beet", new BigDecimal("400"));
        Harvest secondField = new Harvest(2, "Field with grain", "Wheat", new BigDecimal("6010"));
        Harvest thirdField = new Harvest(3, "Field with vegetables", "Tomato", new BigDecimal("2050"));
        Harvest fourthField = new Harvest(4, "Field with vegetables", "Tomato", new BigDecimal("5820"));
        Harvest fifthField = new Harvest(5, "Field with grain", "Wheat", new BigDecimal("1089"));
        Harvest sixField = new Harvest(6, "Field with grain", "Corn", new BigDecimal("6076"));

        Harvest[] harvests = new Harvest[]{firstField, secondField, thirdField, fourthField, fifthField, sixField};

        HarvestStatistic[] harvestStatistics = harvestStatisticService.calculateStatistic(harvests);

        int fieldWithValue = 0;

        for (int i = 0; i < harvestStatistics.length; i++) {
            if (harvestStatistics[i] != null) {
                fieldWithValue++;
            }
        }
        HarvestStatistic[] statistics = new HarvestStatistic[fieldWithValue];

        for (int i = 0; i < harvestStatistics.length; i++) {
            if (harvestStatistics[i] != null) {
                statistics[i] = harvestStatistics[i];
            }
        }
        for (HarvestStatistic statistic : statistics) {
            System.out.println(statistic);
        }
    }
}
