package ru.levelup.lesson6.generics;

public class Calculator<T extends Number> {

    private T arg1;
    private T arg2;

    public Calculator(T arg1, T arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    public Double summa() {
        return arg1.doubleValue() + arg2.doubleValue();
    }
    public Double minus() {
        return arg1.doubleValue() - arg2.doubleValue();
    }
    public Double multiply() {
        return arg1.doubleValue() * arg2.doubleValue();
    }
    public Double division() {
        return arg1.doubleValue() / arg2.doubleValue();
    }

    public <X extends Number> Double summa(X arg) {
        return summa() + arg.doubleValue();
    }
}
