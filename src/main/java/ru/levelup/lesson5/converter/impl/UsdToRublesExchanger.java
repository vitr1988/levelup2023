package ru.levelup.lesson5.converter.impl;

import ru.levelup.lesson5.converter.Exchanger;
import ru.levelup.lesson5.converter.Valutes;

public class UsdToRublesExchanger implements Exchanger {

    @Override
    public Valutes getType() {
        return Valutes.USD2RUR;
    }
}
