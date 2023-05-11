package org.example.hw_28.task_2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Application {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        InputStream resource = ClassLoader.getSystemResourceAsStream("hw_28/task_2/advertisements.json");
        List<Advertisement> advertisements = objectMapper.readValue(resource, new TypeReference<>() {
        });

        List<Advertisement> filteredAdvertisements = advertisements.stream()
                .filter(advertisement -> !advertisement.getCity().equals("Минск"))
                .toList();

        File output = new File("src/main/java/org/example/hw_28/task_2/cars_not_from_minsk.json");
        objectMapper.writeValue(output, filteredAdvertisements);
    }
}
