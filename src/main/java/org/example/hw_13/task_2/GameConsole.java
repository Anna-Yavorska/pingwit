package org.example.hw_13.task_2;

import java.util.Objects;

public class GameConsole {
    private String name;
    private String model;

    public GameConsole(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameConsole that = (GameConsole) o;
        return Objects.equals(name, that.name) && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model);
    }

    @Override
    public String toString() {
        return "GameConsole[" +
                "name=" + name + ", " +
                "model=" + model + ']';
    }
}
