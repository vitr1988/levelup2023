package ru.levelup.lesson5;

public class Figure {

    int a;

    protected Figure(int a) {
        this.a = a;
    }

//    public int getA() {
//        return a;
//    }

    public void info() {
        print("Эта фигура имеет сторону размерностью " + a);
    }

    protected void print(String str) {
        System.out.println(str);
    }
}


//private private-package protected public