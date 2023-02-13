package ru.levelup.lesson4.person;

public class Male extends Human {

    private int workExperience;

    public Male(String name, int age) {
        super(name, age);
    }

    public void setWorkExperience(int experience) {
        this.workExperience = experience;
    }

    @Override
    public void beOlder(int age) {
        super.beOlder(age * 2);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Парень с именем " + getName() + " имеет возраст " + getAge());
    }
}
