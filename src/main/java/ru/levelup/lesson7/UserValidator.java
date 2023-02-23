package ru.levelup.lesson7;

public class UserValidator {

    public static void checkElements(User[] users) {
        for (User user : users) {
            if (!user.validate()) {
                throw new InvalidDataUserException(user);
            }
        }
    }
}
