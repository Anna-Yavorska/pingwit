package org.example.hw_15.task_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        String firstPackagePath = "src/main/java/org/example/hw_15/task_4/package_1";
        String secondPackagePath = "src/main/java/org/example/hw_15/task_4/package_1/package_2";
        String thirdPackagePath = "src/main/java/org/example/hw_15/task_4/package_1/package_2/package_3";
        String pathToText = "src/main/java/org/example/hw_15/task_4/package_1/package_2/file.txt";

        String[] packagePaths = new String[]{firstPackagePath, secondPackagePath};
        for (String path : packagePaths) {
            File file = new File(path);
            System.out.println(file.isDirectory() ? "Directory" : "Not a directory");
        }

        File thirdDirectory = new File(thirdPackagePath);
        System.out.println(thirdDirectory.mkdir() ? "New directory created" : "Directory with this path already exists");

        File file = new File(pathToText);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
