package org.example.hw_25.task_4;

import org.example.hw_25.task_3.User;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class UserService {
    public List<User> removeIf(List<User> users, Predicate<String> condition) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User next = iterator.next();
            if (condition.test(next.getName())) {
                iterator.remove();
            }
        }
        return users;
    }

}
