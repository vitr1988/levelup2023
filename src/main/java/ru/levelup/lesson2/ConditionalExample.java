package ru.levelup.lesson2;

import java.util.Random;

public class ConditionalExample {

    public static void main(String[] args) {
        System.out.println(abs(10));
        System.out.println(abs(-10));
        System.out.println(abs(0));

        printIfNeeded("Printed text");

        System.out.println(compare(10));
        System.out.println(compare(-10));
        System.out.println(compare(0));

        System.out.println(toBeOrNotToBe(false));
        System.out.println(toBeOrNotToBe(true));

        System.out.println(divide(25, false));
    }

    private static void printIfNeeded(String printedText) {
        double digit = 0.12;
        if (new Random().nextBoolean()) {
            int value = 10 + (int) digit;
            System.out.println(printedText);
        }

    }

    public static int abs(int value) {
//        int result;
//        if (value >= 0) {
////            result = value;
//            return value;
//        } else {
////            result = -value;
//            return -value;
//        }
//        return result;
        return value >= 0 ? value : -value;
    }

    public static int compare(int value) {
//        if (value > 0) {
//            return 1;
//        } else if (value == 0) {
//            return 0;
//        } else {
//            return -1;
//        }
        return value > 0
                ? 1
                : value == 0 ? 0 : -value;
    }

    public static String toBeOrNotToBe(boolean flag) {
        return flag && new Random().nextBoolean() ? "To be" : "Not to be";
//        return flag | new Random().nextBoolean() ? "To be" : "Not to be";
    }

    public static int divide(int inputValue, boolean flag) {
        return flag &&
                inputValue != 0
                ? 100 / inputValue
                : 0;
    }
}
