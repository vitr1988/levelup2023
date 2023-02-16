package ru.levelup.lesson5;

public class Circle extends Figure {

    public static final double PI = 3.14;

    protected Circle(int a) {
        super(a);
    }

    public double square() {
        return PI * a * a;
    }
}
