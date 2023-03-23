package org.example.hw_16.task_3;

import java.io.*;

public class CopyWithFile {
    public static void main(String[] args) {
        String pathToOriginal = "src/main/java/org/example/hw_16/files/queen.txt";
        String pathToCopy = "src/main/java/org/example/hw_16/files/file_copy.txt";

        try (FileReader reader = new FileReader(pathToOriginal);
             FileWriter writer = new FileWriter(pathToCopy)
        ) {
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
                writer.write(data);
            }
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}