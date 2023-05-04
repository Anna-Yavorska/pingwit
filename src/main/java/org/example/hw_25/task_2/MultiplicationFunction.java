package org.example.hw_25.task_2;

import java.util.function.BinaryOperator;

// все гуд
public class MultiplicationFunction {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiplication = (firstNumber, secondNumber) -> firstNumber * secondNumber;
        Integer apply = multiplication.apply(4, 5);
        System.out.println(apply);
    }
}
