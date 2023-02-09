package ru.levelup.lesson3;

import java.util.Random;

public class DoWhileExample {

    public static void main(String[] args) {
        int result = 0;
        do {
            int value = new Random().nextInt(100);
            System.out.println(value);
            result += value;
        } while(new Random().nextBoolean());
        System.out.println("Общий результат: " + result);
    }

    public static int getValue() {

        return 1;
    }
}
