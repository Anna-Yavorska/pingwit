package org.example.hw_17.task_2;

import java.io.Serializable;
import java.util.Objects;

public class Song implements Serializable {
    private String author;
    private String name;
    private long listeningCount;

    public Song() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getListeningCount() {
        return listeningCount;
    }

    public void setListeningCount(long listeningCount) {
        this.listeningCount = listeningCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return listeningCount == song.listeningCount && Objects.equals(author, song.author) && Objects.equals(name, song.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name, listeningCount);
    }

    @Override
    public String toString() {
        return "Song{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", listeningCount=" + listeningCount +
                '}';
    }
}
