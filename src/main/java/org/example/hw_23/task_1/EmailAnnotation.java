package org.example.hw_23.task_1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Постфикс ..Annotation делать не нужно. Можно назвать аннотацию @ValidEmail
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EmailAnnotation {
}
