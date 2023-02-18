package org.example.hw_8.task_1;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private int birthYear;
    private Gender gender;
    private FamilyStatus status;

    public Person(String name, String surname, int birthYear, Gender gender, FamilyStatus status) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.gender = gender;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public FamilyStatus getStatus() {
        return status;
    }

    public void setStatus(FamilyStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return birthYear == person.birthYear && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && gender == person.gender && status == person.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthYear, gender, status);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthYear=" + birthYear +
                ", gender=" + gender +
                ", status=" + status +
                '}';
    }
}
