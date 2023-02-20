package ru.levelup.lesson6;

public interface B extends A {

    void b();
    default void m() {
        System.out.println("Класс B");
    }
}
