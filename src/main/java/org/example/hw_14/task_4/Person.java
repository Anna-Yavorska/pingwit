package org.example.hw_14.task_4;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Person {
    private final String name;
    private final String surname;
    private final LocalDate dateOfBirth;
    private final DayOfWeek dayOfWeek;

    public Person(String name, String surname, LocalDate dateOfBirth, DayOfWeek dayOfWeek) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.dayOfWeek = dayOfWeek;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", dayOfWeek=" + dayOfWeek +
                '}';
    }
}
