package org.example.hw_27.task_1;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ServiceForListAbonentsTest {
    private final ServiceForListAbonents target = new ServiceForListAbonents();

    @Test
    void shouldReturnTrue_whenVipAbonentIsPresent() {
        //given
        List<Abonent> abonents = List.of(
                new Abonent("Lena", "Lomonosova", "LL123456", LocalDate.of(1989, 5, 24), LocalDate.of(2021, 7, 30), true, "New York"),
                new Abonent("Andrej", "Lomonosov", "AL123456", LocalDate.of(1987, 11, 4), LocalDate.of(2018, 12, 28), true, "Madrid"),
                new Abonent("Arsenij", "Romanov", "12KY3456", LocalDate.of(1990, 1, 14), LocalDate.of(2015, 10, 3), false, "New York"),
                new Abonent("Roman", "Polakevich", "LL1LO456", LocalDate.of(1986, 5, 6), LocalDate.of(2010, 5, 6), true, "Berdiansk"),
                new Abonent("Alla", "Mokova", "LL123MH6", LocalDate.of(1993, 1, 13), LocalDate.of(2022, 8, 18), false, "London"),
                new Abonent("Alina", "Keymar", "LL12PI56", LocalDate.of(1999, 7, 10), LocalDate.of(2011, 10, 23), true, "Rovno"),
                new Abonent("Lev", "Tolstoj", "NMU097F", LocalDate.of(1987, 6, 8), LocalDate.of(2016, 4, 19), true, "Zaporozhje"),
                new Abonent("Kevin", "Smith", "6483ASE", LocalDate.of(1995, 8, 9), LocalDate.of(2020, 1, 15), false, "Berdiansk")
        );
        //when
        Boolean actual = target.isAnyVipInCity(abonents, "Madrid");
        //then
        assertTrue(actual);
    }

    @Test
    void shouldReturnFalse_whenVipAbonentIsAbsent() {
        // given
        List<Abonent> abonents = List.of(
                new Abonent("Arsenij", "Romanov", "12KY3456", LocalDate.of(1990, 1, 14), LocalDate.of(2015, 10, 3), false, "Madrid"),
                new Abonent("Roman", "Polakevich", "LL1LO456", LocalDate.of(1986, 5, 6), LocalDate.of(2010, 5, 6), true, "Berdiansk"),
                new Abonent("Alla", "Mokova", "LL123MH6", LocalDate.of(1993, 1, 13), LocalDate.of(2022, 8, 18), false, "Madrid"),
                new Abonent("Alina", "Keymar", "LL12PI56", LocalDate.of(1999, 7, 10), LocalDate.of(2011, 10, 23), false, "Rovno"),
                new Abonent("Lev", "Tolstoj", "NMU097F", LocalDate.of(1987, 6, 8), LocalDate.of(2016, 4, 19), false, "Madrid"),
                new Abonent("Kevin", "Smith", "6483ASE", LocalDate.of(1995, 8, 9), LocalDate.of(2020, 1, 15), false, "Berdiansk")
        );
        //when
        Boolean actual = target.isAnyVipInCity(abonents, "Madrid");
        //then
        assertFalse(actual);

    }

    @Test
    void shouldReturnTrue_whenDateIsBefore() {
        // given
        List<Abonent> abonents = List.of(
                new Abonent("Arsenij", "Romanov", "12KY3456", LocalDate.of(1990, 1, 14), LocalDate.of(2015, 10, 3), false, "Madrid"),
                new Abonent("Roman", "Polakevich", "LL1LO456", LocalDate.of(1986, 5, 6), LocalDate.of(2010, 5, 6), true, "Berdiansk"),
                new Abonent("Alla", "Mokova", "LL123MH6", LocalDate.of(1993, 1, 13), LocalDate.of(2022, 8, 18), false, "Madrid"),
                new Abonent("Alina", "Keymar", "LL12PI56", LocalDate.of(1999, 7, 10), LocalDate.of(2011, 10, 23), false, "Rovno"),
                new Abonent("Lev", "Tolstoj", "NMU097F", LocalDate.of(1987, 6, 8), LocalDate.of(2016, 4, 19), false, "Madrid"),
                new Abonent("Kevin", "Smith", "6483ASE", LocalDate.of(1995, 8, 9), LocalDate.of(2020, 1, 15), false, "Berdiansk")
        );
        //when
        assertTrue(target.areAllContractsBeforeDate(abonents, LocalDate.of(2010, 5, 5)));
        //then
    }

    @Test
    void shouldReturnFalse_whenDateIsAfter() {
        // given
        List<Abonent> abonents = List.of(
                new Abonent("Arsenij", "Romanov", "12KY3456", LocalDate.of(1990, 1, 14), LocalDate.of(2015, 10, 3), false, "Madrid"),
                new Abonent("Roman", "Polakevich", "LL1LO456", LocalDate.of(1986, 5, 6), LocalDate.of(2010, 5, 6), true, "Berdiansk"),
                new Abonent("Alla", "Mokova", "LL123MH6", LocalDate.of(1993, 1, 13), LocalDate.of(2022, 8, 18), false, "Madrid"),
                new Abonent("Alina", "Keymar", "LL12PI56", LocalDate.of(1999, 7, 10), LocalDate.of(2011, 10, 23), false, "Rovno"),
                new Abonent("Lev", "Tolstoj", "NMU097F", LocalDate.of(1987, 6, 8), LocalDate.of(2016, 4, 19), false, "Madrid"),
                new Abonent("Kevin", "Smith", "6483ASE", LocalDate.of(1995, 8, 9), LocalDate.of(2020, 1, 15), false, "Berdiansk")
        );
        //when
        assertFalse(target.areAllContractsBeforeDate(abonents, LocalDate.of(2011, 11, 11)));
        //then
    }

    @Test
    void shouldFindAbonent_whenIsPresentInTheCity() {
        //given
        List<Abonent> abonents = List.of(
                new Abonent("Arsenij", "Romanov", "12KY3456", LocalDate.of(1990, 1, 14), LocalDate.of(2015, 10, 3), false, "Madrid"),
                new Abonent("Roman", "Polakevich", "LL1LO456", LocalDate.of(1986, 5, 6), LocalDate.of(2010, 5, 6), true, "Berdiansk"),
                new Abonent("Alla", "Mokova", "LL123MH6", LocalDate.of(1993, 1, 13), LocalDate.of(2022, 8, 18), false, "Madrid"),
                new Abonent("Alina", "Keymar", "LL12PI56", LocalDate.of(1999, 7, 10), LocalDate.of(2011, 10, 23), false, "Rovno"),
                new Abonent("Lev", "Tolstoj", "NMU097F", LocalDate.of(1987, 6, 8), LocalDate.of(2016, 4, 19), false, "Madrid"),
                new Abonent("Kevin", "Smith", "6483ASE", LocalDate.of(1995, 8, 9), LocalDate.of(2020, 1, 15), false, "Berdiansk")
        );
        Abonent expected = new Abonent("Alina", "Keymar", "LL12PI56", LocalDate.of(1999, 7, 10), LocalDate.of(2011, 10, 23), false, "Rovno");
        //when
        Abonent actual = target.findAnyAbonentFromCity(abonents, "Rovno");
        //then
        assertEquals(expected, actual);
    }

    @Test
    void shouldThrowIllegalArgumentException_whenAbonentIsAbsentInTheCity() {
        //given
        List<Abonent> abonents = List.of(
                new Abonent("Arsenij", "Romanov", "12KY3456", LocalDate.of(1990, 1, 14), LocalDate.of(2015, 10, 3), false, "Madrid"),
                new Abonent("Roman", "Polakevich", "LL1LO456", LocalDate.of(1986, 5, 6), LocalDate.of(2010, 5, 6), true, "Berdiansk"),
                new Abonent("Alla", "Mokova", "LL123MH6", LocalDate.of(1993, 1, 13), LocalDate.of(2022, 8, 18), false, "Madrid"),
                new Abonent("Alina", "Keymar", "LL12PI56", LocalDate.of(1999, 7, 10), LocalDate.of(2011, 10, 23), false, "Rovno"),
                new Abonent("Lev", "Tolstoj", "NMU097F", LocalDate.of(1987, 6, 8), LocalDate.of(2016, 4, 19), false, "Madrid"),
                new Abonent("Kevin", "Smith", "6483ASE", LocalDate.of(1995, 8, 9), LocalDate.of(2020, 1, 15), false, "Berdiansk")
        );
        String expected = "Any abonent wasn't find";
        //when
        IllegalArgumentException london = assertThrows(IllegalArgumentException.class, () -> target.findAnyAbonentFromCity(abonents, "London"));
        //then
        assertEquals(expected, london.getMessage());
    }
}