package ru.levelup.lesson7.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DigitExample {

    public static void main(String[] args) {
        int initialCapacity = 100;
        List<Integer> digits = new ArrayList<>(initialCapacity);
        for (int i = 0; i < initialCapacity; i++) {
            digits.add(i + 1);
        }
        System.out.println(digits);
        int counter = 1;
//        for (Integer value: digits) {
        for (Iterator<Integer> iterator = digits.iterator(); iterator.hasNext();) {
            Integer value = iterator.next();
            if (counter % 2 == 0) { // четное
                iterator.remove();
            }
            counter++;
        }
        System.out.println("Индекс элемента 65 равен " + digits.indexOf(65));

        digits.add(32, -1);
        System.out.println(digits);
        System.out.println(digits.size());

    }
}
