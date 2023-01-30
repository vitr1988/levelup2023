package ru.levelup.lesson1;

public class HelloWorld {

    public static void main(String[] args) {
        printWord("Hello, world 2023!");
        printWord("Hello, mother!");
        int value1 = 29;
        int value2 = -100;
        printWord(summa(value1, value2));
        printWord(summa(100500, 0));

        int digit = 0b0000000000110; //= 0 * 2 ^ 0 + 1 * 2 ^ 1 + 1 * 2 ^ 2 = 6
        double number = 125.12;
        printWord(summa(number, (double) value2));

//        boolean flag = true;
        boolean flag = false;
    }



    public static void printWord(String word) {
        System.out.println(word);
    }

    public static void printWord(int result) {
        System.out.println(result);
    }

    public static void printWord(double result) {
        System.out.println(result);
    }

    public static int summa(int arg1, int arg2) {
        return arg1 + arg2;
    }
    public static double summa(double arg1, double arg2) {
        return arg1 + arg2;
    }

}
