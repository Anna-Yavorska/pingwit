package org.example.hw_25.task_6;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ReversedStringComparator reversedStringComparator = new ReversedStringComparator();
        List<String> strings = new ArrayList<>(List.of("P", "A", "N", "O", "q", "Q"));

        ReverseOrderForStrings<List<String>> finishedList = reversedStringComparator::reverse;
        List<String> sortedReversedList = finishedList.orderReversely(strings);
        System.out.println(sortedReversedList);
    }
}
