package org.example.hw_26.task_4;

import org.example.hw_26.task_2.Address;

import java.util.List;

public class FindingUniqueCities {
    public static void main(String[] args) {
        List<Address> addresses = List.of(
                new Address("Lviv", "Zelena", 5, 21),
                new Address("Zaporizhzhia", "Pamiatna", 3, 1),
                new Address("Lviv", "Pamiatna", 6, 15),
                new Address("Kyiv", "Kashtanova", 78, 65),
                new Address("Berdiansk", "Pliazhna", 4, 22),
                new Address("Kyiv", "Kashtanova", 82, 15),
                new Address("Zaporizhzhia", "Kahovska", 3, 78),
                new Address("Rivne", "Jamkova", 1, 64),
                new Address("Rivne", "Zelena", 1, 64),
                new Address("Berdiansk", "Pliazhna", 4, 22),
                new Address("Kyiv", "Boulevard Shevchenka", 2, 14));

        List<String> uniqueCities = addresses.stream()
                .map(Address::getCity)
                .distinct()
                .toList();

        uniqueCities.forEach(System.out::println);
    }
}
