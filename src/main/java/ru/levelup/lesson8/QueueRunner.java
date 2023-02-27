package ru.levelup.lesson8;

import java.util.LinkedList;
import java.util.Queue;

public class QueueRunner {

    public static void main(String[] args) {
        Queue<Integer> integers = new LinkedList<>();
        integers.offer(12);
        integers.offer(-12);
        integers.offer(0);
        integers.offer(10);
        integers.offer(1);
        Integer currentElement;
        while((currentElement = integers.poll()) != null) {
            System.out.println(currentElement);
        }
    }
}
