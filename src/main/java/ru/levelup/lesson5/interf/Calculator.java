package ru.levelup.lesson5.interf;

public class Calculator implements Calculatable {
    @Override
    public int summa(int a, int b) {
        return a + b;
    }

    @Override
    public int raznost(int a, int b) {
        return a - b;
    }

    @Override
    public int module(int a) {
        return Math.abs(a);
    }

    @Override
    public int square(int a) {
        return (int) Math.sqrt(a);
    }
}
