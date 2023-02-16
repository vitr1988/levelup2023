package ru.levelup.lesson5.converter;

import static ru.levelup.lesson5.converter.Valutes.EUR2RUR;
import static ru.levelup.lesson5.converter.Valutes.USD2RUR;

public interface Exchanger {

    default double convert(double value) {
        return value * getKoefficient();
    }

    static void print(double value) {
        System.out.println(value);
    }

    default double getKoefficient() {
        double v = switch (getType()) {
            case EUR2RUR -> EUR2RUR.getValue();
            case USD2RUR -> USD2RUR.getValue();
        };
        double result = 5;
        return v;
    }

    Valutes getType();
}
