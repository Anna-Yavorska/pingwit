package org.example.hw_25.task_6;

import java.util.List;

@FunctionalInterface
public interface ReverseOrderForStrings<T> {
    List<String> orderReversely(T t);
}
