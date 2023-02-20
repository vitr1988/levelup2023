package ru.levelup.lesson6.exception;

public class ExceptionRunner {
    public static void main(String[] args) {
        try {
            int a = 100, b = 1;
            System.out.println("Деление на ноль " + a / b);
            String nullString = null;
            int position = nullString.indexOf("текст");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль для целых чисел недопустимо");
        } catch (NullPointerException e) {
            System.out.println("Нельзя вызывать методы на null-объектах");
        }

        System.out.println("Здесь также хотелось бы видеть текст");
    }
}
