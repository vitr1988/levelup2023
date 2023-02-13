package ru.levelup.lesson4.figure;

public class Square {

    private int a;

    public Square(int a) {
        if (a > 0) {
            this.a = a;
        } else {
            System.out.println("Недопустимо использование в качестве длины стороны квадрата отрицательных значений. " +
                    "Взято умолчательное значение 11");
            this.a = 11;
        }
    }

    public int getA() {
        return a;
    }

    public int square() {
//        return this.a * this.a;
        return (int) Math.pow(a, 2);
    }

    public int perimeter() {
        return 4 * this.a;
    }
}
