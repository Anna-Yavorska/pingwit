package org.example.hw_25.task_4;

import org.example.hw_25.task_3.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Application {
    public static void main(String[] args) {
        UserService userService = new UserService();
        // здесь нужно использовать не &&, а ||
        Predicate<String> startWith = s -> s.startsWith("A") && s.startsWith("P") && s.startsWith("E");
        List<User> users = new ArrayList<>(List.of(new User("Alla"), new User("Gosha"), new User("Paskal"), new User("Evgenij")));
        List<User> filteredList = userService.removeIf(users, startWith);
        System.out.println(filteredList);
    }
}
