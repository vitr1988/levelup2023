package ru.levelup.lesson8;

import ru.levelup.lesson8.impl.Rectangle;
import ru.levelup.lesson8.impl.Triangle;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

    public static void main(String[] args) {
        Set<Figure> figures = new LinkedHashSet<>(List.of());
        figures.add(new Triangle(10, 6));
        figures.add(new Rectangle(5, 10));
        figures.add(new Triangle(10, 6));
        figures.add(new Triangle(1, 6));


//        for(Figure fig: figures) {
        for(Iterator<Figure> iter = figures.iterator(); iter.hasNext(); ) {
            Figure next = iter.next();
        }

//        Set<Figure> figures = Set.of(
//                new Triangle(10, 6),
//                new Rectangle(5, 10),
//                new Triangle(10, 6));
        System.out.println(figures);
        System.out.println("----");
//        Set<Figure> otherFigures = new TreeSet<>();
        Set<Triangle> otherFigures = new TreeSet<>(new Comparator<>() {
            @Override
            public int compare(Triangle o1, Triangle o2) {
                return (o1.getHeight() - o2.getHeight()) + (o1.getSide() - o2.getSide());
            }
        });
        otherFigures.add(new Triangle(10, 6));
//        otherFigures.add(new Rectangle(5, 10));
        otherFigures.add(new Triangle(10, 6));
        otherFigures.add(new Triangle(1, 6));
        otherFigures.add(new Triangle(5, 7));
        System.out.println(otherFigures);


    }
}
