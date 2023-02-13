package ru.levelup.lesson4.figure;

public class Rectangle extends Square {

    private int b;

    public Rectangle(int a, int b) {
        super(a);
        this.b = b;
    }

    public int getB() {
        return b;
    }

    @Override
    public int square() {
        return getA() * getB();
    }

    @Override
    public int perimeter() {
        return 2 * (getA() + getB());
    }
}
