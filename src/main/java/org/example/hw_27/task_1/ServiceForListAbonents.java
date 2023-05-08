package org.example.hw_27.task_1;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class ServiceForListAbonents {
    public Boolean isVipAbonents(List<Abonent> abonents, String city) {
        return abonents.stream()
                .filter(abonent -> city.equals(abonent.getCity()))
                .anyMatch(Abonent::getVip);
    }

    public Boolean contractBeforeDate(List<Abonent> abonents, LocalDate localDate) {
        return abonents.stream()
                .allMatch(abonent -> localDate.isBefore(abonent.getContractDate()));
    }

    public Abonent abonentFromCity(List<Abonent> abonents, String city) {
        Optional<Abonent> abonentFromCity = abonents.stream()
                .filter(abonent -> city.equals(abonent.getCity()))
                .findAny();
        return abonentFromCity.orElseThrow(() -> new IllegalArgumentException("Any abonent wasn't find"));
    }
}
