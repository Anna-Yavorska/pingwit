package org.example.hw_25.task_3;

@FunctionalInterface
public interface CreatingObject<T> {
    User create(T t);
}
