package ru.levelup.lesson7;

public class User {

    private long id; // must be > 0
    private String name; // must be less than 10 symbols
    private Role role; // not null
    private long expirationPasswordTime; // > System.currentTimeMillis() // количество мсек на текущий момент времени

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(long id, String name, Role role, long expirationPasswordTime) {
        this(id, name);
        this.role = role;
        this.expirationPasswordTime = expirationPasswordTime;
    }

    public long getId() throws InvalidLongIdException {
        if (id <= 0) {
            throw new InvalidIdException();
        }
        return id;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    public boolean validate() {
        return id > 0
                && name.length() <= 10
                && role != null
                && expirationPasswordTime > System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role=" + role +
                ", expirationPasswordTime=" + expirationPasswordTime +
                '}';
    }

}
