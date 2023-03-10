package org.example.hw_4.task_1;

import java.util.Scanner;

// Отлично!
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate = 40.0;
        int beforeConversion;
        double afterConversion;
        System.out.println("Вас приветствует конвертер валют!");
        System.out.println("Введите валюту для конвертации 'eur' или 'uah':");
        String currencyCode = scanner.next();

        switch (currencyCode) {
            case "eur":
                System.out.println("Введите сумму:");
                beforeConversion = scanner.nextInt();
                afterConversion = beforeConversion * rate;
                System.out.println("К выдаче " + afterConversion + " гривен");
                break;
            case "uah":
                System.out.println("Введите сумму:");
                beforeConversion = scanner.nextInt();
                afterConversion = beforeConversion / rate;
                System.out.println("К выдаче " + afterConversion + " евро");
                break;
            default:
                System.out.println("Валюта " + currencyCode + " не поддерживается");
                return;
        }
        System.out.println("Ждём вас снова!");
    }
}
