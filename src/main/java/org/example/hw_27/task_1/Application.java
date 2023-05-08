package org.example.hw_27.task_1;

import org.example.hw_27.task_2.AbonentsStatisticsService;
import org.example.hw_27.task_3.AbonentsGroupingService;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        ServiceForListAbonents forListAbonents = new ServiceForListAbonents();
        AbonentsGroupingService groupingService = new AbonentsGroupingService();
        AbonentsStatisticsService yearsStatistics = new AbonentsStatisticsService();
        List<Abonent> abonents = List.of(
                new Abonent("Lena", "Lomonosova", "LL123456", LocalDate.of(1989, 5, 24), LocalDate.of(2021, 7, 30), true, "New York"),
                new Abonent("Andrej", "Lomonosov", "AL123456", LocalDate.of(1987, 11, 4), LocalDate.of(2018, 12, 28), true, "Madrid"),
                new Abonent("Arsenij", "Romanov", "12KY3456", LocalDate.of(1990, 1, 14), LocalDate.of(2015, 10, 3), false, "New York"),
                new Abonent("Roman", "Polakevich", "LL1LO456", LocalDate.of(1986, 5, 6), LocalDate.of(2010, 5, 6), true, "Berdiansk"),
                new Abonent("Alla", "Mokova", "LL123MH6", LocalDate.of(1993, 1, 13), LocalDate.of(2022, 8, 18), false, "London"),
                new Abonent("Alina", "Keymar", "LL12PI56", LocalDate.of(1999, 7, 10), LocalDate.of(2011, 10, 23), true, "Rovno"),
                new Abonent("Lev", "Tolstoj", "NMU097F", LocalDate.of(1987, 6, 8), LocalDate.of(2016, 4, 19), true, "Zaporozhje"),
                new Abonent("Kevin", "Smith", "6483ASE", LocalDate.of(1995, 8, 9), LocalDate.of(2020, 1, 15), false, "Berdiansk"),
                new Abonent("Dominik", "Domov", "1697BHY", LocalDate.of(1984, 7, 13), LocalDate.of(2021, 3, 19), false, "New York"),
                new Abonent("Ben", "Neymar", "3456VTY", LocalDate.of(1975, 6, 25), LocalDate.of(2022, 10, 3), true, "London"),
                new Abonent("Tom", "Molotov", "LDMF987", LocalDate.of(1966, 5, 29), LocalDate.of(2011, 8, 29), true, "Berdiansk"),
                new Abonent("Monika", "Kotova", "PIJD4598", LocalDate.of(1980, 11, 27), LocalDate.of(2014, 6, 4), false, "Madrid"),
                new Abonent("Roza", "Sova", "LPIYT5547", LocalDate.of(1986, 8, 4), LocalDate.of(2020, 12, 8), true, "Rovno"),
                new Abonent("Kate", "Gregorovich", "RRLL156", LocalDate.of(1993, 3, 2), LocalDate.of(2019, 9, 30), false, "Berdiansk"),
                new Abonent("Diana", "Javornaja", "SWLL1PU6", LocalDate.of(1996, 4, 6), LocalDate.of(2022, 6, 5), true, "Madrid"),
                new Abonent("Anatolij", "Polov", "TTESX344", LocalDate.of(2000, 10, 14), LocalDate.of(2023, 4, 13), false, "Zaporozhje"),
                new Abonent("Valerij", "Tkachenko", "BNJJU5321", LocalDate.of(1983, 11, 21), LocalDate.of(2009, 7, 25), true, "Rovno"),
                new Abonent("Liudmila", "Tsarenko", "BHUTD125", LocalDate.of(2001, 5, 7), LocalDate.of(2020, 7, 31), false, "New York"),
                new Abonent("Ben", "Lenov", "LOIKJ56", LocalDate.of(2000, 6, 2), LocalDate.of(2018, 8, 5), true, "Zaporozhje"),
                new Abonent("Henry", "Smith", "56VGTRE", LocalDate.of(1999, 8, 14), LocalDate.of(2017, 11, 9), false, "London"),
                new Abonent("Lana", "Koval", "56VNMLP", LocalDate.of(1990, 12, 3), LocalDate.of(2020, 4, 15), true, "Madrid"),
                new Abonent("Polina", "Sova", "VFDXV157", LocalDate.of(1995, 2, 12), LocalDate.of(2022, 12, 1), false, "Rovno"),
                new Abonent("Denis", "Radov", "LGOO2589", LocalDate.of(1988, 5, 15), LocalDate.of(2021, 1, 10), true, "Zaporozhje")
        );

        Boolean isVipAbonents = forListAbonents.isVipAbonents(abonents, "New York");
        System.out.println(isVipAbonents ? "Yes" : "No");
        Abonent abonentFromCity = forListAbonents.abonentFromCity(abonents, "Rovno");
        System.out.println(abonentFromCity);
        Boolean isBefore = forListAbonents.contractBeforeDate(abonents, LocalDate.of(2009, 7, 24));
        System.out.println(isBefore);

        String statisticsByDateOfBirth = yearsStatistics.statisticsByDateOfBirth(abonents);
        System.out.println(statisticsByDateOfBirth);
        String statisticsByContractDate = yearsStatistics.contractStatistics(abonents);
        System.out.println(statisticsByContractDate);

        System.out.println("================Ordinary Abonents================");
        Map<String, Abonent> ordinaryAbonents = groupingService.findOrdinaryAbonents(abonents);
        for (Map.Entry<String, Abonent> abonent : ordinaryAbonents.entrySet())
            System.out.println(abonent.getKey() + " - " + abonent.getValue());
        System.out.println("================Grouping Abonents By Cities================");
        Map<String, List<Abonent>> abonentsByCities = groupingService.groupByCities(abonents);
        for (Map.Entry<String, List<Abonent>> cities : abonentsByCities.entrySet()) {
            System.out.println(cities.getKey() + " - " + cities.getValue());
        }
    }
}
