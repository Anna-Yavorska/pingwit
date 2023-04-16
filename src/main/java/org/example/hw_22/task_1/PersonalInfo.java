package org.example.hw_22.task_1;

public class PersonalInfo {

    private String name;
    private String surname;
    private int age;
    private boolean isMarried;

    public PersonalInfo() {
    }

    public PersonalInfo(String name, String surname, int age, boolean isMarried) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isMarried = isMarried;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", isMarried=" + isMarried +
                '}';
    }
}
