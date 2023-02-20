package ru.levelup.lesson6.generics;

public class CalculatorRunner {

    public static void main(String[] args) {
        Calculator<Long> longCalculator = new Calculator<>(12L, 2L);
        System.out.println("Сумма двух чисел в калькуляторе равна " + longCalculator.summa());
        System.out.println("Сумма трех чисел в калькуляторе равна " + longCalculator.summa(1f));
        short value = 12;
        System.out.println("Сумма трех чисел в калькуляторе равна " + longCalculator.summa(value));
        System.out.println("Разность двух чисел в калькуляторе равна " + longCalculator.minus());
        System.out.println("Умножение двух чисел в калькуляторе равна " + longCalculator.multiply());
        System.out.println("Деление двух чисел в калькуляторе равна " + longCalculator.division());
        System.out.println("---------");
        Calculator<Integer> integerCalculator = new Calculator<>(100, 50);
        System.out.println("Сумма двух чисел в калькуляторе равна " + integerCalculator.summa());
        System.out.println("Разность двух чисел в калькуляторе равна " + integerCalculator.minus());
        System.out.println("Умножение двух чисел в калькуляторе равна " + integerCalculator.multiply());
        System.out.println("Деление двух чисел в калькуляторе равна " + integerCalculator.division());
        System.out.println("---------");
        Calculator<Double> doubleCalculator2 = new Calculator<>(100., 50.);
        System.out.println("Сумма двух чисел в калькуляторе равна " + doubleCalculator2.summa());
        System.out.println("Разность двух чисел в калькуляторе равна " + doubleCalculator2.minus());
        System.out.println("Умножение двух чисел в калькуляторе равна " + doubleCalculator2.multiply());
        System.out.println("Деление двух чисел в калькуляторе равна " + doubleCalculator2.division());
    }
}
