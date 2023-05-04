package org.example.hw_25.task_3;

// все гуд
public class Application {
    public static void main(String[] args) {
        CreatingObject<String> creatingFunction = User::new;
        User user = creatingFunction.create("Alla");
        System.out.println(user);
    }
}
