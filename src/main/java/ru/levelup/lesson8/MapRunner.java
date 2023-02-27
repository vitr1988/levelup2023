package ru.levelup.lesson8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapRunner {

    public static void main(String[] args) {
        Map<Integer, String> regions = new HashMap<>(89);
//        Map<Integer, String> regions = new LinkedHashMap<>(89);
        regions.put(1, "Абаканский край");
        regions.put(63, "Самарская область");
        regions.put(77, "Московская область");
        regions.put(78, "Ленинградская область");
        regions.put(36, "Воронежская область");
        regions.put(55, "Оренбургская область");
        regions.put(34, "Белгородская область");
        regions.put(23, "Краснодарский край");
        regions.put(53, "Псковской область");
        regions.put(94, "Московская область, г. Байконур");
        regions.put(76, null);

        System.out.println(regions);
        System.out.println(regions.get(23));
        System.out.println(regions.containsKey(76)
                ? (regions.get(76) == null ? "Пустое значение" : regions.get(76))
                : null);
        System.out.println(regions.getOrDefault(null, "Несуществующий регион"));
        for (Map.Entry<Integer, String> entry : regions.entrySet()) {
            System.out.println("Код региона: " + entry.getKey() + " и наименование: " + entry.getValue());
        }

        Map<Integer, String> regions2 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });
        regions2.putAll(regions);
        regions2.put(34, "Волгоградская область");
        System.out.println(regions2);
    }
}
