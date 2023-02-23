package ru.levelup.lesson7;

public class UserGenerator {

    public static User[] generate() {
        return new User[] {
                new User(1, "Vitalii", Role.ADMIN, System.currentTimeMillis() + 1_000_000),
                new User(2, "Petr", null, System.currentTimeMillis() + 1_000),
                new User(3, "Kate", Role.ADMIN, System.currentTimeMillis() + 50_000),
                new User(4, "Fedor", Role.USER, System.currentTimeMillis() + 20_000),
                new User(5, "Test", Role.ADMIN, System.currentTimeMillis() - 1_000_000),
                new User(6, "Innokentiy", Role.GUEST, System.currentTimeMillis() + 10),
                new User(7, "Olga", Role.USER, System.currentTimeMillis() - 20_000),
        };
    }
}
