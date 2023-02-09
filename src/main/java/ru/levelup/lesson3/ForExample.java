package ru.levelup.lesson3;

import java.util.Random;

public class ForExample {

    public static void main(String[] args) {
        for (int value = 1, value2 = 0, value3 = -1; value <= 100; value+=7) {
            System.out.println(value);
        }

        System.out.println("---");

        inifiniteLoop();

        System.out.println("---");
        int from = 100;
        int to = 200;
        System.out.println("Сумма значений от " + from + " до " + to + " равна " + summa(from, to));
    }

    private static void inifiniteLoop() {
        for (;;) {
            if (new Random().nextBoolean()) {
                System.out.println("Hello World!");
                break;
            } else {
                System.out.println("Unlucky!");
            }
        }
    }

    public static long summa(int start, int end) {
        long result = 0;
        for (long i = start; i <= end; i++) {
            result += i; //result = result + i;
        }
        return result;
    }
}
