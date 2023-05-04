package org.example.hw_26.task_1;

import java.util.List;

// все хорошо
public class FilteredStringByLength {
    public static void main(String[] args) {
        List<String> collectionsInterfaces = List.of("Iterable", "Collection", "List", "Queue", "Deque", "Set", "SortedSet");
        List<String> filteredString = collectionsInterfaces.stream()
                .filter(string -> string.length() >= 5)
                .toList();
        System.out.println(filteredString);
    }
}
