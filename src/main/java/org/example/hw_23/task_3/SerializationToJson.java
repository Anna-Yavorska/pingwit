package org.example.hw_23.task_3;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.hw_23.task_1.AccountInformation;

import java.io.*;

public class SerializationToJson {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        AccountInformation accountInformation = new AccountInformation("Egor", "Senechkin", "senechkin@gmail.com", "895124634");
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/main/java/org/example/hw_23/task_3/serialization.json"))) {
            byte[] bytes = mapper.writeValueAsBytes(accountInformation);
            bos.write(bytes);
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
