package org.example.hw_21.task_1.second_option;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BlackListService {
    private static final int MAX_FAILED_ATTEMPTS = 3;
    private static final Integer UNIT = 1;
    Map<String, Integer> failedUserLogins = new HashMap<>();
    Set<String> blackList = new HashSet<>();

    public boolean isBanned(String username) {
        return blackList.contains(username);
    }

    public void increaseFailedLoginCounter(String username) {
        if (failedUserLogins.containsKey(username)) {
            Integer counter = failedUserLogins.get(username);
            failedUserLogins.put(username, counter + UNIT);
            if (failedUserLogins.get(username) == MAX_FAILED_ATTEMPTS) {
                blackList.add(username);
                System.out.println(username + ", you are banned!");
            }
        } else {
            failedUserLogins.put(username, UNIT);
        }
    }

    public void resetFailedLoginCount(String username) {
        failedUserLogins.remove(username);
    }
}
