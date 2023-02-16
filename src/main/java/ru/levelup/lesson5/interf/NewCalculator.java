package ru.levelup.lesson5.interf;

public class NewCalculator implements Calculatable {

    @Override
    public int summa(int a, int b) {
        return raznost(a, -b);
    }

    @Override
    public int raznost(int a, int b) {
        return a - b;
    }

    @Override
    public int module(int a) {
        return 0;
    }

    @Override
    public int square(int a) {
        return 0;
    }
}
