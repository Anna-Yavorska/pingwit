package org.example.hw_13.task_3;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsPersonReverser implements PersonReverser {
    @Override
    public Person reversePerson(Person person) {
        Person reversePerson = new Person();

        String reverseName = StringUtils.reverse(person.getName());
        reversePerson.setName(reverseName);

        String reverseSurname = StringUtils.reverse(person.getSurname());
        reversePerson.setSurname(reverseSurname);

        return reversePerson;
    }
}
