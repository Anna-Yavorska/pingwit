package org.example.hw_25.task_6;

import java.util.Collections;
import java.util.List;

public class ReversedStringComparator {
    public List<String> reverse(List<String> strings) {
        Collections.sort(strings);
        Collections.reverse(strings);
        return strings;
    }
}
