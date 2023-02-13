package ru.levelup.lesson4.person;

public class HumanRunner {

    public static void main(String[] args) {
//        Human vitaliy = new Male("Vitalii Ivanov", 34);
        Male vitaliy = new Male("Vitalii Ivanov", 34);
//        Male vitaliy = new Human("Vitalii Ivanov", 34); // ошибка
        Human sister = new Female("Daria Ivanova", 25);
        vitaliy.beOlder();
        sister.beOlder();
        System.out.println("Текущий возраст Виталия " + vitaliy.getAge());
        System.out.println("Текущий возраст Дарьи " + sister.getAge());
//        ((Male) vitaliy).setWorkExperience(15);
        vitaliy.setWorkExperience(15);

        Human[] family = new Human[] {vitaliy, sister};
        for (Human human : family) {
            human.print();
        }
//        System.out.println("Текущий возраст Виталия " + vitaliy.getAge());
//        System.out.println("Текущий возраст Дарьи " + sister.getAge()); System.out.println("Текущий возраст Виталия " + vitaliy.getAge());
//        System.out.println("Текущий возраст Дарьи " + sister.getAge());
    }
}
