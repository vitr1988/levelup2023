package ru.levelup.lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Stream;

public class StreamRunner {

    public static void main(String[] args) {
        List<Integer> digits = List.of(1, 0, -100, 45, 67, -299, 107);
        int result = 0;
        for (Integer digit: digits) {
            result += digit;
        }
        System.out.println("Сумма элементов списка: " + result);
        Integer integer = digits.stream().reduce((a, b) -> a + b).get();
        System.out.println("Сумма элементов списка: " + integer);
        System.out.println("Сумма элементов списка: " + digits.stream().max(Comparator.naturalOrder()).get());

        List<Integer> integers = generateRandoms(0);
        System.out.println(integers.contains(10));

        Map<String, String> map = Map.of("927", "Мегафон", "917", "МТС");
        Stream<Map.Entry<String, String>> stream = map.entrySet().stream();
    }

    public static List<Integer> generateRandoms(int size) {
        if (size <= 0) {
            return Collections.emptyList();
        }
        List<Integer> result = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            result.add(new Random().nextInt());
        }
        return result;
    }
}
