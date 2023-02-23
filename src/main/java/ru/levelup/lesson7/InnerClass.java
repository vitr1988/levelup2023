package ru.levelup.lesson7;

public class InnerClass {

    private final int index;
    private String word;

    public InnerClass(int index, String word) {
        this.index = index;
        this.word = word;
    }

    public void print() {
        System.out.println(word);
        class A {
            int id;
            private long index;

            public void print() {
                System.out.println(index);
            }
        }
        A a = new A();
        a.print();
    }
}
