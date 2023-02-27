package ru.levelup.lesson8.impl;

import ru.levelup.lesson8.Figure;

import java.util.Objects;

public class Rectangle implements Figure, Comparable<Rectangle> {

    private final int a;

    private final int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int square() {
        return a * b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return a == rectangle.a && b == rectangle.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public int compareTo(Rectangle other) {
        return this.a - other.a + this.b - other.b;
    }
}
