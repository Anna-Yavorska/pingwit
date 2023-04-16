package org.example.hw_22.task_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutoInfoService {
    public Map<String, List<AutoInfo>> groupByBrand(List<AutoInfo> autoInfos) {
        Map<String, List<AutoInfo>> autosByBrand = new HashMap<>();
        for (AutoInfo autoInfo : autoInfos) {
            String brand = autoInfo.getBrand();
            if (autosByBrand.containsKey(brand)) {
                List<AutoInfo> autoInfoList = autosByBrand.get(brand);
                autoInfoList.add(autoInfo);
            } else {
                autosByBrand.put(brand, new ArrayList<>(List.of(autoInfo)));
            }
        }
        return autosByBrand;
    }

    public Map<Integer, List<Float>> groupByCylindersQuantity(List<AutoInfo> autoInfos) {
        Map<Integer, List<Float>> autosByCylinders = new HashMap<>();
        for (AutoInfo autoInfo : autoInfos) {
            int cylinderCount = autoInfo.getCylinderCount();
            float engineVolume = autoInfo.getEngineVolume();
            if (autosByCylinders.containsKey(cylinderCount)) {
                List<Float> engineVolumeList = autosByCylinders.get(cylinderCount);
                engineVolumeList.add(engineVolume);
            } else {
                autosByCylinders.put(cylinderCount, new ArrayList<>(List.of(engineVolume)));
            }
        }
        return autosByCylinders;
    }
}
