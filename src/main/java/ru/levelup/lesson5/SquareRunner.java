package ru.levelup.lesson5;

import static ru.levelup.lesson5.Square.counter;
import static ru.levelup.lesson5.Square.square;
import static ru.levelup.lesson5.Circle.PI;

public class SquareRunner {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 12);



        System.out.println("Здесь просто текст");
        Square square = new Square(10);
        square.info();
        square(23);
        new Square();
        Object sq = new Square(12);

        System.out.println("Значение поля index = " + square.getIndex());

        Figure figure = new Figure(100);
        figure.info();

        System.out.println("Общее количество созданных квадратов равно " + counter);
        System.out.println("Число пи равно " + PI);

    }
}
