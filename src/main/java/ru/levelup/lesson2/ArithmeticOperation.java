package ru.levelup.lesson2;

public class ArithmeticOperation {

    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        System.out.println(perimeter(a, b));
        System.out.println(Math.pow(10, 2));
        double value = 5;
        int operand = 2;
        System.out.println(value / operand);
        System.out.println("-------");
        System.out.println("Результат деления значения на 2 и проверка его нечетности: " + isOddDigit((int) value));
        System.out.println("-------");
        System.out.println(next(operand));
        System.out.println("-------");
        System.out.println(and(true, false));
        System.out.println(or(true, false));
        System.out.println(not(false));
    }

    public static int perimeter(int a, int b) {
        return 2 * (a + b);
    }

    public static boolean isOddDigit(int digit) {
        return digit % 2 == 1; // ==
    }

    public static int next(int digit) {
        int newValue = digit++;
        return digit; // digit + 1
    }

    public static boolean and(boolean flag1, boolean flag2) {
        return flag1 && flag2; // conjunction = конъюнкция
    }

    public static boolean or(boolean flag1, boolean flag2) {
        return flag1 || flag2; // disjunction = дизъюнкция
    }

    public static boolean not(boolean flag) {
        return !flag;
    }
}
