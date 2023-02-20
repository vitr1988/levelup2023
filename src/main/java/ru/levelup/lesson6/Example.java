package ru.levelup.lesson6;

import java.util.Objects;

public class Example implements Cloneable {

    private final String word;

    public Example(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return "Example{" +
                "word='" + word + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example example = (Example) o;
        return Objects.equals(word, example.word);
    }

    @Override
    public int hashCode() {
        return word == null ? -1 : word.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
