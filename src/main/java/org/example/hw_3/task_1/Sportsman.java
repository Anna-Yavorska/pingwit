package org.example.hw_3.task_1;

public class Sportsman {
    public static void main(String[] args) {
        int distance = 10;
        int persent = 10;
        int days = 7;
        int totalDistance = 0;
        for (int i = 1; i < days; i++) {
            // в этой формуле есть ошибка. она правильно работает только если процент == 10,
            // если процент увеличить - получится неправильно d = d + (d * percent/100)
            distance = distance + (distance / persent);
            totalDistance += distance;
        }
        System.out.println(totalDistance);
    }
}
