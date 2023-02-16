package ru.levelup.lesson5;

public class Square extends Figure {

//    public int a;
    static int counter;

    static {
        counter = 0;
        System.out.println("Создали класс квадрата");
    }

    int index = 0;

    {
        System.out.println("Создали объект класса квадрат");
        index = 1;
    }

    Square(int a) {
        super(a);
        counter++;
        index = 2;
    }

    protected Square() {
        this(10);
    }

    public int square() {
        return (int) Math.pow(a, 2);
    }

    public static int square(int a) {
        return a * a;
    }

    @Override
    protected void print(String str) {
        super.print(str);
    }

    private void print(int index) {
        print(index + "");
    }

    public int getIndex() {
        return index;
    }
}
