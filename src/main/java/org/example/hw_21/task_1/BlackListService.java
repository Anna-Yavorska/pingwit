package org.example.hw_21.task_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Pavel Radkevich
 * @since 10.04.23
 */
// это примерна струкрута сервиса, попробуй плиз сделать второе решение на основе его. первоей свое решеие оставь
    // решеие с BlackListService сделай в другом класе
public class BlackListService {

    Map<String, Integer> failedUserLogins = new HashMap<>();
    Set<String> blackList = new HashSet<>();

    void isBanned(String username) {

    }

    void increaseFailedLoginCounter(String username) {

    }

    void resetFailedLoginCount(String username) {

    }
}
