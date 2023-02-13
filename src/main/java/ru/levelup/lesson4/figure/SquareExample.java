package ru.levelup.lesson4.figure;

public class SquareExample {

    public static void main(String[] args) {
        Square square = new Square(10);
        System.out.println("Площадь квадрата со стороной " + square.getA() + " равна " + square.square());
        System.out.println("Периметр квадрата со стороной " + square.getA() + " равен " + square.perimeter());
        System.out.println("---");
        Square anotherSquare = new Square(120);
        System.out.println("Площадь квадрата со стороной " + anotherSquare.getA() + " равна " + anotherSquare.square());
        System.out.println("Периметр квадрата со стороной " + anotherSquare.getA() + " равен " + anotherSquare.perimeter());
        System.out.println("---");
        Square defaultSquare = new Square(-123);
        System.out.println("Площадь квадрата со стороной " + defaultSquare.getA() + " равна " + defaultSquare.square());
        System.out.println("Периметр квадрата со стороной " + defaultSquare.getA() + " равен " + defaultSquare.perimeter());
    }
}
