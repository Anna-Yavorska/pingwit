package org.example.hw_7.task_4;

import java.math.BigDecimal;

public class HarvestStatisticService {
    public HarvestStatistic[] calculateStatistic(Harvest[] harvests) {
        HarvestStatistic[] harvestStatistics = new HarvestStatistic[harvests.length];

        for (int i = 0; i < harvests.length; i++) {
            String plant = harvests[i].getPlant();

            for (int j = 0; j < harvestStatistics.length; j++) {
                HarvestStatistic statistic = harvestStatistics[j];

                if (harvestStatistics[j] == null) {
                    HarvestStatistic harvestStatistic = new HarvestStatistic();
                    harvestStatistic.setPlant(plant);
                    harvestStatistic.setTotalWeight(harvests[i].getWeight());
                    harvestStatistics[j] = harvestStatistic;
                    break;

                } else {

                    if (plant.equals(statistic.getPlant())) {
                        BigDecimal weight = harvests[i].getWeight();
                        BigDecimal totalWeight = harvestStatistics[j].getTotalWeight();
                        totalWeight = totalWeight.add(weight);
                        harvestStatistics[j].setTotalWeight(totalWeight);
                        break;
                    }
                }

            }

        }
        return harvestStatistics;
    }
}
