package org.example.hw_26.task_5;

import org.example.hw_26.task_2.Address;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Pavel Radkevich
 * @since 4.05.23
 */
class StreetByCityMapperTest {

    private final StreetByCityMapper target = new StreetByCityMapper();

    @Test
    void shouldMapStreetsForCity() {
        // given
        List<Address> addresses = List.of(
                new Address("Warshawa", "Polska", 15, 8),
                new Address("Poznan", "Studentska", 45, 3),
                new Address("Kyiv", "Zelena", 3, 6),
                new Address("Kyiv", "Studentska", 43, 36),
                new Address("Warshawa", "Zelena", 5, 8),
                new Address("Lviv", "Zelena", 6, 9),
                new Address("Warshawa", "Polska", 1, 74),
                new Address("Warshawa", "Shopena", 11, 13));

        Set<CityStreet> expected = Set.of(
                new CityStreet("Kyiv", "Zelena"),
                new CityStreet("Kyiv", "Studentska")
        );

        // when
        Set<CityStreet> actual = target.mapToCities(addresses, "Kyiv");

        // then
        // assertj
        assertThat(actual).containsExactlyElementsOf(expected);

    }
}
