package org.example.hw_26.task_5;

import org.example.hw_26.task_2.Address;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        List<Address> addresses = List.of(
                new Address("Warshawa", "Polska", 15, 8),
                new Address("Poznan", "Studentska", 45, 3),
                new Address("Kyiv", "Zelena", 3, 6),
                new Address("Kyiv", "Studentska", 43, 36),
                new Address("Warshawa", "Zelena", 5, 8),
                new Address("Lviv", "Zelena", 6, 9),
                new Address("Warshawa", "Polska", 1, 74),
                new Address("Warshawa", "Shopena", 11, 13));

        Set<CityStreet> warshawaAddresses = addresses.stream()
                .filter(address -> address.getCity().equals("Warshawa"))
                .map(address -> new CityStreet(address.getCity(), address.getStreet()))
                .collect(Collectors.toSet());

        warshawaAddresses.forEach(System.out::println);
    }
}
