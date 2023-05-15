package org.example.hw_29.task_1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceTest {
    private final GreetingService target = new GreetingService();

    @Test
    void shouldReturnGreeting_whenNameIsValid() throws IllegalAccessException {
        //given
        String expected = "Приветсвую тебя, Пользователь";
        //when
        String actual = target.greet("Пользователь");
        //then
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMessageAboutLackOfNumbers_whenNameContainsNumbers() {
        //given
        String expected = "имя не может содержать цифры!";
        //when
        IllegalArgumentException actual = assertThrows(IllegalArgumentException.class, () -> target.greet("Пользователь1"));
        //then
        assertEquals(expected, actual.getMessage());
    }

    @Test
    void shouldReturnMessageAboutEmptyString_whenNameIsEmptyOrNull() {
        //given
        String expected = "имя не может быть пустой строкой!";
        //when
        IllegalArgumentException actual = assertThrows(IllegalArgumentException.class, () -> target.greet(" "));
        //then
        assertEquals(expected, actual.getMessage());
    }
}