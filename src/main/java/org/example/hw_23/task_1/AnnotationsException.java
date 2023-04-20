package org.example.hw_23.task_1;

// Здесь бы я также рекомендовал именовать класс больше по его бизнес-ценности
// эту ошибку бросаем в случае ошибок валидации - подойдет ValidationException или что-то подобное
public class AnnotationsException extends RuntimeException {
    public AnnotationsException(String message) {
        super(message);
    }
}
