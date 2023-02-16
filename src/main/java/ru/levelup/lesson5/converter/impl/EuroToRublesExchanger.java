package ru.levelup.lesson5.converter.impl;

import ru.levelup.lesson5.converter.Exchanger;
import ru.levelup.lesson5.converter.Valutes;

public class EuroToRublesExchanger implements Exchanger {

    @Override
    public Valutes getType() {
        return Valutes.EUR2RUR;
    }
}
