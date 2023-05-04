package org.example.hw_26.task_6;

import org.example.hw_26.task_2.Address;
import org.example.hw_26.task_5.CityStreet;

import java.util.List;

// все хорошо
public class FindingKyivStreets {
    public static void main(String[] args) {
        List<Address> addresses = List.of(
                new Address("Warshawa", "Polska", 15, 8),
                new Address("Poznan", "Studentska", 45, 3),
                new Address("Kyiv", "Zelena", 3, 6),
                new Address("Kyiv", "Studentska", 43, 36),
                new Address("Kyiv", "Kashtanova", 78, 65),
                new Address("Kyiv", "Kashtanova", 82, 15),
                new Address("Zaporizhzhia", "Kahovska", 3, 78),
                new Address("Warshawa", "Zelena", 5, 8),
                new Address("Lviv", "Zelena", 6, 9),
                new Address("Lviv", "Pamiatna", 6, 15),
                new Address("Kyiv", "Ukrainska", 7, 16),
                new Address("Kyiv", "Zelena", 8, 34),
                new Address("Warshawa", "Shopena", 11, 13));

        addresses.stream()
                .map(address -> new CityStreet(address.getCity(), address.getStreet()))
                .filter(cityStreet -> cityStreet.getCity().equals("Kyiv"))
                .forEach(cityStreet -> System.out.println("Street: " + cityStreet.getStreet()));
    }
}
