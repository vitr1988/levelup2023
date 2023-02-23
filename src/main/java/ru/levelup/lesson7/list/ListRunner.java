package ru.levelup.lesson7.list;

import ru.levelup.lesson7.RemoteUser;
import ru.levelup.lesson7.Role;
import ru.levelup.lesson7.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListRunner {

    public static void main(String[] args) {
//        List<User> users = List.of(new User(1, "Vitalii"), new User(2, "Kate"));
        List<User> users = new ArrayList<>(List.of(new User(1, "Vitalii"), new User(2, "Kate")));
        users.add(new User(3, "Petr"));
        User eve = new User(4, "Eve");
        users.add(new RemoteUser(1, "", Role.ADMIN, 1));
        if (!users.contains(eve)) {
            users.add(eve);
        }
        if (!users.contains(eve)) {
            users.add(eve);
        }
        Collection<User> c = new ArrayList<>();
        if (!users.containsAll(c)) {
            users.addAll(c);
        }
//        for (User user : users) {
        for (Iterator<User> iterator = users.iterator(); iterator.hasNext(); ) {
            User user = iterator.next();
            System.out.println(user);
        }

        User user = users.get(0);
        System.out.println("Элемент с 0 индексом " + user);

        users.remove(eve);
        users.set(0, new User(1, "Innokentiy"));

        System.out.println(users);


        List<Double> doubles = ListUtil.generateRandomList(1000);
        System.out.println(doubles);
        System.out.println("Max " + ListUtil.max(doubles));
        System.out.println("Min " + ListUtil.min(doubles));
    }
}
