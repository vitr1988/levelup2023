package ru.levelup.lesson9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateRunner {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(DateTimeFormatter.ofPattern("dd.MM.yyyy").format(date));

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss").format(dateTime));

        LocalDateTime days30ago = dateTime.minusDays(30);
        System.out.println(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss").format(days30ago));
    }
}
