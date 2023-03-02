package ru.levelup.lesson9.dto;

import java.io.Serializable;

public class PersonDto implements Serializable {

    private Long id;
    private String name;
    private transient Boolean sex; // true = male, false = female

    private PersonDto() {}

    public PersonDto(Long id, String name, boolean sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
