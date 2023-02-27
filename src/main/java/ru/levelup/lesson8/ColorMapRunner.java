package ru.levelup.lesson8;

import java.util.HashMap;
import java.util.Map;

public class ColorMapRunner {

    public static void main(String[] args) {
        Map<String, String> colors = new HashMap<>();
        colors.put("GRE", "Зеленый");
        colors.put("PUR", "Фиолетовый");
        colors.put("YEL", "Желтый");
        colors.put("BRO", "Коричневый");
        colors.put("WHI", "Белый");
        colors.put("PUR", "Багровый");
        colors.put(null, null);
        colors.put(null, "Неопределенный цвет");

        System.out.println(colors.get("PUR"));

        System.out.println(colors);
    }
}
