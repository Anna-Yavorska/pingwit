package org.example.hw_28.task_2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Advertisement {
    private long id;
    private String title;
    private String description;
    private String city;
    private int status;
    private String lastTimeUp;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCity() {
        return city;
    }

    public int getStatus() {
        return status;
    }

    public String getLastTimeUp() {
        return lastTimeUp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Advertisement that = (Advertisement) o;
        return id == that.id && status == that.status && Objects.equals(title, that.title) && Objects.equals(description, that.description) && Objects.equals(city, that.city) && Objects.equals(lastTimeUp, that.lastTimeUp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, city, status, lastTimeUp);
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", city='" + city + '\'' +
                ", status=" + status +
                ", lastTimeUp='" + lastTimeUp + '\'' +
                '}';
    }
}
