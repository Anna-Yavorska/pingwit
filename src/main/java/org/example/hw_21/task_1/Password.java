package org.example.hw_21.task_1;

import java.util.Objects;

public class Password {
    private static final int UNIT = 1;
    private int attemptsQuantity;
    private final String password;

    public Password(Integer attemptsQuantity, String password) {
        this.attemptsQuantity = attemptsQuantity;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public int getAttemptsQuantity() {
        return attemptsQuantity;
    }

    private void setAttemptsQuantity(int attemptsQuantity) {
        this.attemptsQuantity = attemptsQuantity;
    }

    public void changeAttemptsQuantity(Password password) {
        password.setAttemptsQuantity(password.getAttemptsQuantity() - UNIT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Password password1 = (Password) o;
        return attemptsQuantity == password1.attemptsQuantity && Objects.equals(password, password1.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attemptsQuantity, password);
    }

    @Override
    public String toString() {
        return "Password{" +
                "attemptsQuantity=" + attemptsQuantity +
                ", password='" + password + '\'' +
                '}';
    }
}
