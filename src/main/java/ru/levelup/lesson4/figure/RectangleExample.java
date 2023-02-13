package ru.levelup.lesson4.figure;

public class RectangleExample {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 15);
        System.out.println("Площадь прямоугольника со сторонами " + rectangle.getA() + " и " + rectangle.getB() + " равна " + rectangle.square() );
        System.out.println("Периметр прямоугольника со сторонами " + rectangle.getA() + " и " + rectangle.getB() + " равен " + rectangle.perimeter() );
    }
}
