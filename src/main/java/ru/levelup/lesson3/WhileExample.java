package ru.levelup.lesson3;

import java.util.Random;

public class WhileExample {
    public static void main(String[] args) {
        while (!new Random().nextBoolean()) {
            System.out.println("Unlucky!");
        }
        System.out.println("Hello World!");
        long result = 0;
        int i = 100;
        while (i <= 200) {
            result = result + i;
            i++;
        }
        System.out.println(result);
    }
}
