package org.example.hw_26.task_2;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Address> addresses = List.of(
                new Address("Lviv", "Zelena", 5, 21),
                new Address("Zaporizhzhia", "Pamiatna", 3, 1),
                new Address("Zaporizhzhia", "Pamiatna", 1, 10),
                new Address("Lviv", "Pamiatna", 6, 15),
                new Address("Lviv", "Zelena", 5, 21),
                new Address("Kyiv", "Kashtanova", 78, 65),
                new Address("Kyiv", "Kashtanova", 82, 15),
                new Address("Kyiv", "Zelena", 8, 34),
                new Address("Zaporizhzhia", "Kahovska", 3, 78),
                new Address("Kyiv", "Zelena", 5, 10),
                new Address("Rivne", "Jamkova", 1, 64),
                new Address("Berdiansk", "Pliazhna", 4, 22),
                new Address("Kyiv", "Boulevard Shevchenka", 2, 14));

        List<Address> kyivAddresses = addresses.stream()
                .filter(address -> address.getCity().equals("Kyiv"))
                .toList();

        kyivAddresses.forEach(System.out::println);
    }
}
