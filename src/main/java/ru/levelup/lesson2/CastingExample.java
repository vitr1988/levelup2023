package ru.levelup.lesson2;

public class CastingExample {

    public static void main(String[] args) {
        int value = 100;
        double digit = value + 0.1; // 100.1
        value = (int) digit;
        System.out.println(value);
        int bigValue = 1000000000;
        short shortValue = (short) bigValue;
        shortValue /= bigValue; //shortValue = (short) (shortValue / bigValue);
        System.out.println(shortValue);
        short newShortValue = 123;
        int newIntValue = newShortValue;
        byte a = 1;
        byte c = (byte) (a + 1);
    }
}
