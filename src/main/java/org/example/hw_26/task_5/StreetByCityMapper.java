package org.example.hw_26.task_5;

import org.example.hw_26.task_2.Address;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Pavel Radkevich
 * @since 4.05.23
 */
public class StreetByCityMapper {

    public Set<CityStreet> mapToCities(List<Address> addresses, String city) {
        Set<CityStreet> cityStreets = addresses.stream()
                .map(address -> new CityStreet(address.getCity(), address.getStreet()))
                // тут возможна небольшая оптимизация: можно сначала оставить в стриме только адреса Варшавы, а потом
                // преобразовать их в короткие адреса - так джаве придется создавать меньше "мусорных" объектов
                // исправлять не нужно, просто для информации
                .filter(cityStreet -> cityStreet.getCity().equals(city))
                .collect(Collectors.toSet());

        return cityStreets;
    }

}
