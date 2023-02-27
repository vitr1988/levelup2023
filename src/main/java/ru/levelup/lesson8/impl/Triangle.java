package ru.levelup.lesson8.impl;

import ru.levelup.lesson8.Figure;

import java.util.Objects;

public class Triangle implements Figure/**, Comparable<Triangle>**/ {

    private final int height;
    private final int side;

    public Triangle(int height, int side) {
        this.height = height;
        this.side = side;
    }

    public int getHeight() {
        return height;
    }

    public int getSide() {
        return side;
    }

    @Override
    public int square() {
        return 1/2 * height * side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return height == triangle.height && side == triangle.side;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, side);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", side=" + side +
                '}';
    }

//    @Override
//    public int compareTo(Triangle other) {
//        return (this.height - other.height) + (this.side - other.side);
//    }
}
