package org.example.hw_14.task_4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PersonParser {
    public Person[] parseToPerson(String string) {
        String[] strings = findPerson(string);
        Person[] people = new Person[strings.length];
        int index = 0;
        try {
            for (int i = 0; i < strings.length; i++) {
                Person person = new Person();
                String[] personVariables = strings[i].split(", ");

                String firstVariable = personVariables[index];
                person.setName(firstVariable);

                String secondVariable = personVariables[index + 1];
                person.setSurname(secondVariable);

                String s = personVariables[index + 2];
                int dayNumber = Integer.parseInt(s);
                DayOfWeek dayOfWeek = DayOfWeek.of(dayNumber);
                person.setDayOfWeek(dayOfWeek);

                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-dd-MM");
                String date = personVariables[index + 3];
                LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);
                person.setDateOfBirth(localDate);
                people[i] = person;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return people;
    }

    private static String[] findPerson(String string) {
        return string.split("; ");
    }
}
