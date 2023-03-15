package org.example.hw_14.task_3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Application {
    public static void main(String[] args) {
        String firstDate = "2023-17-01";
        String secondDate = "23-2022-01";
        String thirdDate = "15-07-2022";

        DateTimeFormatter firstDataFormatter = DateTimeFormatter.ofPattern("yyyy-dd-MM");
        DateTimeFormatter secondDataFormatter = DateTimeFormatter.ofPattern("dd-yyyy-MM");
        DateTimeFormatter thirdDataFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        DateTimeFormatter dayFirst = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        DateTimeFormatter monthNumberFirst = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
        DateTimeFormatter yearFirst = DateTimeFormatter.ofPattern("yyyy-dd-MMM");
        DateTimeFormatter monthFirst = DateTimeFormatter.ofPattern("MMMM-dd-yyyy");

        DateTimeFormatter[] formatters = new DateTimeFormatter[]{firstDataFormatter, secondDataFormatter, thirdDataFormatter};
        String[] dates = new String[]{firstDate, secondDate, thirdDate};

        for (int i = 0; i < dates.length; i++) {
            LocalDate localDate = LocalDate.parse(dates[i], formatters[i]);
            System.out.println(dayFirst.format(localDate));
            System.out.println(monthNumberFirst.format(localDate));
            System.out.println(yearFirst.format(localDate));
            System.out.println(monthFirst.format(localDate));
            System.out.println("===========");
        }

        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("ms:ss:mm:HH dd, E, MMM yyyy");
        System.out.println(dateTimeFormatter.format(time));
    }
}
