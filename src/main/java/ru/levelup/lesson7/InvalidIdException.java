package ru.levelup.lesson7;

public class InvalidIdException extends RuntimeException {

    public InvalidIdException() {
        super("Некорректный идентификатор объекта");
    }
}
