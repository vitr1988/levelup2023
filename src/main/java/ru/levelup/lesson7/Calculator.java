package ru.levelup.lesson7;

public class Calculator {

    public static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        int result = -1;
        try {
            result = div(10, 2);
        } catch (ArithmeticException e) {
            result = 0;
        } finally {
//            System.out.println(result);
            result = 100;
        }
        System.out.println(result);
    }

}
