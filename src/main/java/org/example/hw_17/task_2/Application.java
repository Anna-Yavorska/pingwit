package org.example.hw_17.task_2;

import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        File firstFile = new File("src/main/java/org/example/hw_17/task_2/tracks/track_1.json");
        File secondFile = new File("src/main/java/org/example/hw_17/task_2/tracks/track_2.json");
        File thirdFile = new File("src/main/java/org/example/hw_17/task_2/tracks/track_3.json");
        File fourthFile = new File("src/main/java/org/example/hw_17/task_2/tracks/track_4.json");

        try {
            Song firstSong = mapper.readValue(firstFile, Song.class);
            Song secondSong = mapper.readValue(secondFile, Song.class);
            Song thirdSong = mapper.readValue(thirdFile, Song.class);
            Song fourthSong = mapper.readValue(fourthFile, Song.class);
            Song[] songs = new Song[]{firstSong, secondSong, thirdSong, fourthSong};
            for (Song song : songs) {
                System.out.println(song);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
