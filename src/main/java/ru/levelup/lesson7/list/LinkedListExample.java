package ru.levelup.lesson7.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        List<String> words = new LinkedList<>();
        words.add("Hello");
        words.addAll(List.of("World", "Motherland", "Russia"));
        words.add("!");

        System.out.println(words);
        System.out.println(words.get(1));
    }
}
