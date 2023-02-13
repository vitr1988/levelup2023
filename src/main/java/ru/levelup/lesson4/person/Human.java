package ru.levelup.lesson4.person;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void beOlder() {
        this.age++;
    }

    public void beOlder(int age) {
        this.age += age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("Этот человек имеет имя " + name + " и возраст " + age);
    }
}
