package org.example.hw_14.task_1;

// При именовании классов ошибок принято называть их по схеме xxxException, в данном случае ConnectingException было бы хорошо
public class Connecting extends Exception {
    public Connecting(String message) {
        super(message);
    }
}
