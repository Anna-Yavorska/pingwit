package org.example.hw_27.task_2;

import org.example.hw_27.task_1.Abonent;

import java.time.LocalDate;
import java.time.Period;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class AbonentsStatisticsService {
    public String statisticsByDateOfBirth(List<Abonent> abonents) {
        IntSummaryStatistics statistics = abonents.stream()
                .mapToInt(abonent -> Period.between(abonent.getDateOfBirth(), LocalDate.now()).getYears()).summaryStatistics();
        return String.format("Количество абонентов - %s. Самый юный - %s лет, самый возрастной - %s лет, средний возраст - %s лет", statistics.getCount(), statistics.getMin(), statistics.getMax(), statistics.getAverage());
    }

    public String contractStatistics(List<Abonent> abonents) {
        IntSummaryStatistics contracts = abonents.stream()
                .filter(Abonent::getVip)
                .mapToInt(abonent -> Period.between(abonent.getContractDate(), LocalDate.now()).getYears()).summaryStatistics();
        return String.format("Количесвто абонентов - %s. Самый долгий контракт - %s лет, средний срок контрактв - %s лет", contracts.getCount(), contracts.getMax(), contracts.getAverage());
    }
}
