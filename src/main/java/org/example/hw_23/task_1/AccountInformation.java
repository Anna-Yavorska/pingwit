package org.example.hw_23.task_1;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.example.hw_23.task_2.OnlyDigitsAnnotation;

import java.util.Objects;


public class AccountInformation {
    @LettersOnly
    private String name;
    @LettersOnly
    private String surname;
    @ValidEmail
    private String email;
    @OnlyDigitsAnnotation
    @JsonIgnore
    private String phoneNumber;

    public AccountInformation() {
    }

    public AccountInformation(String name, String surname, String email, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountInformation that = (AccountInformation) o;
        return Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(email, that.email) && Objects.equals(phoneNumber, that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email, phoneNumber);
    }

    @Override
    public String toString() {
        return "AccountInformation{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
