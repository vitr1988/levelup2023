package ru.levelup.lesson7;

public class InvalidDataUserException extends RuntimeException {

    private final User user;

    public InvalidDataUserException(User user) {
        super("Некорректное состояние объекта: " + user);
        this.user = user;
    }

    public long getUserId() {
        return user.getId();
    }
}
