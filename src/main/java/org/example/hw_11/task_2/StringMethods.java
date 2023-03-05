package org.example.hw_11.task_2;

import org.example.hw_11.task_1.Smartphone;

public class StringMethods {
    public static void main(String[] args) {
        Smartphone smart = new Smartphone("Xiaomi", "Redmi 10", "Android", 5000, 5);
        String model = smart.getModel();
        String type = smart.getType();

        String join = String.join(", ", "Type", type, "Model", model);
        System.out.println(join);

        String format = String.format("У вас в руках %s. Модель - %s", type, model);
        System.out.println(format);

        System.out.println(format.toLowerCase());
        System.out.println(format.toUpperCase());

        String camelCase = "PingWit";
        String lowerCase = "pingwit";
        System.out.println(camelCase.equalsIgnoreCase(lowerCase));

        String withSpace = "  hello darkness my old friend      ";
        String strip = withSpace.strip();
        System.out.println(strip);

        String replace = strip.replaceAll(" ", "_");
        System.out.println(replace);

        String empty = "";
        String space = " ";
        System.out.println(empty.isEmpty());
        System.out.println(space.isBlank());
    }
}
