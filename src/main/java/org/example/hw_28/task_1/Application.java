package org.example.hw_28.task_1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Application {
    public static void main(String[] args) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        ObjectMapper objectMapper = new ObjectMapper();
        InputStream resource = ClassLoader.getSystemResourceAsStream("hw_28/task_1/posts.xml");
        List<Post> posts = xmlMapper.readValue(resource, new TypeReference<>() {});
        posts.forEach(System.out::println);

        File output = new File("src/main/java/org/example/hw_28/task_1/output_post.json");
        objectMapper.writeValue(output, posts.get(0));

    }
}
