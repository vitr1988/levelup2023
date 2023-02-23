package ru.levelup.lesson7;

public class RemoteUser extends User {

    public RemoteUser(long id, String name, Role role, long expirationPasswordTime) {
        super(id, name, role, expirationPasswordTime);
    }

    @Override
    public long getId() throws InvalidIdException {
        return super.getId();
    }
}
