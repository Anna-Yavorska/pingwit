package org.example.hw_16.task_4;

import java.io.*;

public class CopyWithBuffer {
    public static void main(String[] args) {
        String pathToOriginal = "src/main/java/org/example/hw_16/files/queen.txt";
        String pathToCopy = "src/main/java/org/example/hw_16/files/buffer_copy.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(pathToOriginal));
             BufferedWriter writer = new BufferedWriter(new FileWriter(pathToCopy))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                writer.write(line.concat("\n"));
            }
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
