package ru.levelup.lesson7.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListUtil {

    public static List<Double> generateRandomList(int capacity) {
        List<Double> doubles = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            doubles.add(Math.random());
        }
        return doubles;
    }

    public static double max(List<Double> digits) {
//        if (digits.isEmpty()) {
//            return -1;
//        }
//        double max = digits.get(0);
//        for (Double value: digits) {
//            if (max < value) {
//                max = value;
//            }
//        }
//        return max;
        return Collections.max(digits);
    }

    public static double min(List<Double> digits) {
//        double min = digits.get(0);
//        for (Double value: digits) {
//            if (min > value) {
//                min = value;
//            }
//        }
//        return min;
        return Collections.min(digits);
    }
}
