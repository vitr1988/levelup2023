package ru.levelup.lesson6;

public interface C extends A {
    void c();
    default void m() {
        System.out.println("Класс C");
    }
}
