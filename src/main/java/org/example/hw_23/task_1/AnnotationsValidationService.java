package org.example.hw_23.task_1;

import org.example.hw_23.task_2.OnlyDigitsAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.regex.Pattern;

public class AnnotationsValidationService {
    private static final Pattern ONLY_LETTERS_PATTERN = Pattern.compile("^[a-zA-Z]*$");
    public static final Pattern EMAIL_PATTERN = Pattern.compile("^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$");
    private static final Pattern PHONE_NUMBER_PATTERN = Pattern.compile("\\d+");

    public void validate(Object object) {
        for (Field declaredField : object.getClass().getDeclaredFields()) {
            declaredField.setAccessible(true);
            for (Annotation annotation : declaredField.getAnnotations()) {
                if (annotation.annotationType().equals(LettersOnlyAnnotation.class)) {
                    try {
                        String value = (String) declaredField.get(object);
                        if (!ONLY_LETTERS_PATTERN.matcher(value).matches()) {
                            String message = String.format("Field %s with value %s can contain only letters", declaredField.getName(), value);
                            throw new AnnotationsException(message);
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
                if (annotation.annotationType().equals(EmailAnnotation.class)) {
                    try {
                        String value = (String) declaredField.get(object);
                        if (!EMAIL_PATTERN.matcher(value).matches()) {
                            String message = String.format("Field %s with value %s must contains '@' and '.'", declaredField.getName(), value);
                            throw new AnnotationsException(message);
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
                if (annotation.annotationType().equals(OnlyDigitsAnnotation.class)) {
                    try {
                        String value = (String) declaredField.get(object);
                        if (!PHONE_NUMBER_PATTERN.matcher(value).matches()) {
                            String message = String.format("Field %s with value %s can contains only digits", declaredField.getName(), value);
                            throw new AnnotationsException(message);
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
