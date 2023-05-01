package org.example.hw_25.task_5;

import java.util.List;
import java.util.Objects;

public class Sportsman {
    private String name;
    private Integer speed;
    private List<Medal> medals;

    public Sportsman(String name, Integer speed, List<Medal> medals) {
        this.name = name;
        this.speed = speed;
        this.medals = medals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public List<Medal> getMedals() {
        return medals;
    }

    public void setMedals(List<Medal> medals) {
        this.medals = medals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sportsman sportsman = (Sportsman) o;
        return Objects.equals(name, sportsman.name) && Objects.equals(speed, sportsman.speed) && Objects.equals(medals, sportsman.medals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speed, medals);
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", medals=" + medals +
                '}';
    }
}
