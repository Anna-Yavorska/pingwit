package org.example.hw_16.task_1;

import java.io.*;

public class CopyOfPictureWithFile {
    public static void main(String[] args) {
        String pathOfOriginal = "src/main/java/org/example/hw_16/files/img.png";
        String pathOfCopy = "src/main/java/org/example/hw_16/files/file_img.png";
        try (InputStream inputStream = new FileInputStream(pathOfOriginal);
             OutputStream outputStream = new FileOutputStream(pathOfCopy)
        ) {
            byte[] bytes = inputStream.readAllBytes();
            outputStream.write(bytes);
            outputStream.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
