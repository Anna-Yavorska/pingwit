package org.example.hw_27.task_3;

import org.example.hw_27.task_1.Abonent;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// все отлично
public class AbonentsGroupingService {
    public Map<String, Abonent> findOrdinaryAbonents(List<Abonent> abonents) {
        return abonents.stream()
                .filter(abonent -> abonent.getVip().equals(false))
                .collect(Collectors.toMap(Abonent::getContractId, Function.identity()));
    }

    public Map<String, List<Abonent>> groupByCities(List<Abonent> abonents) {
        return abonents.stream()
                .collect(Collectors.groupingBy(Abonent::getCity));
    }
}
