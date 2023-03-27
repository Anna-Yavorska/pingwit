package org.example.hw_17.task_3;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.hw_17.task_2.Song;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        File firstFile = new File("src/main/java/org/example/hw_17/task_2/tracks/track_1.json");
        File secondFile = new File("src/main/java/org/example/hw_17/task_2/tracks/track_2.json");
        File thirdFile = new File("src/main/java/org/example/hw_17/task_2/tracks/track_3.json");
        File fourthFile = new File("src/main/java/org/example/hw_17/task_2/tracks/track_4.json");

        File[] files = new File[]{firstFile, secondFile, thirdFile, fourthFile};
        Song[] songs = new Song[files.length];

        try {
            for (int i = 0; i < files.length; i++) {
                Song song = mapper.readValue(files[i], Song.class);
                songs[i] = song;
            }
            for (Song song : songs) {
                System.out.println(song);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
