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

            // можно назвать эту переменную name, тк ты исходишь из предположения, что там именно имя находится
            String firstVariable = personVariables[index];

            // с этой переменной аналогично
            String secondVariable = personVariables[index + 1];
            try {
                // эту можно назвать например dayString
                String s = personVariables[index + 2];
                int dayNumber = Integer.parseInt(s);
                DayOfWeek dayOfWeek = DayOfWeek.of(dayNumber);

                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-dd-MM");
                // dateString
                String date = personVariables[index + 3];
                // dateOfBirth
                LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);
                person = new Person(firstVariable, secondVariable, localDate, dayOfWeek);
                people[i] = person;
            } catch (DateTimeException e) {
                System.out.println(e.getMessage());
            }
        }
        return people;
    }

    // этот метод не нужно делать static
    private static String[] findPerson(String string) {
        return string.split("; ");
    }
}
