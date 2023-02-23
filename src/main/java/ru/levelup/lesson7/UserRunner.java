package ru.levelup.lesson7;

public class UserRunner {

    public static void main(String[] args) {
        User[] users = UserGenerator.generate();
        try {
            UserValidator.checkElements(users);
            System.out.println("Первый корректный пользователь с именем " + users[0].getName());
        } catch (InvalidDataUserException e) {
            System.out.println("Объект, на котором произошла ошибка валидации, имеет идентификатор " + e.getUserId());
        }
    }
}
