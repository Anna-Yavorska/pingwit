package org.example.hw_14.task_4;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PersonParser {
    public Person[] parseToPerson(String string) {
        String[] strings = findPerson(string);
        Person[] people = new Person[strings.length];
        int index = 0;

        for (int i = 0; i < strings.length; i++) {
            Person person;
            String[] personVariables = strings[i].split(", ");

            String name = personVariables[index];

            String surname = personVariables[index + 1];
            try {
                String dayString = personVariables[index + 2];
                int dayNumber = Integer.parseInt(dayString);
                DayOfWeek dayOfWeek = DayOfWeek.of(dayNumber);

                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-dd-MM");
                String dateString = personVariables[index + 3];
                LocalDate dateOfBirth = LocalDate.parse(dateString, dateTimeFormatter);

                person = new Person(name, surname, dateOfBirth, dayOfWeek);
                people[i] = person;
            } catch (DateTimeException e) {
                System.out.println(e.getMessage());
            }
        }
        return people;
    }

    private String[] findPerson(String string) {
        return string.split("; ");
    }
}
