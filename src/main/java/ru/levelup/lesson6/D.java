package ru.levelup.lesson6;

public interface D extends B, C {
    @Override
    default void m() {
        System.out.println("Класс D");
    }
}
