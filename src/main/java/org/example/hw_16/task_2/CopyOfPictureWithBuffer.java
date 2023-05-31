package org.example.hw_16.task_2;

import java.io.*;


public class CopyOfPictureWithBuffer {
    public static void main(String[] args) {
        String pathOfOriginal = "src/main/java/org/example/hw_16/files/city.png";
        String pathOfCopy = "src/main/java/org/example/hw_16/files/buffered_img.png";

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(pathOfOriginal));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(pathOfCopy))
        ) {
            byte[] bytes = bufferedInputStream.readAllBytes();
            bufferedOutputStream.write(bytes);
            bufferedOutputStream.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
