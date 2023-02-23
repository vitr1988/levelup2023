package ru.levelup.lesson7.list;

import ru.levelup.lesson7.Role;
import ru.levelup.lesson7.User;
import ru.levelup.lesson7.UserGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserListRunner {

    public static void main(String[] args) {
        User[] users = UserGenerator.generate();
//        List<User> userList = new ArrayList<>();
//        for (User user: users) {
//            userList.add(user);
//        }
        List<User> userList = Arrays.asList(users);
        List<User> result = new ArrayList<>();
        for (User user: userList) {
            if (Role.ADMIN.equals(user.getRole())) {
                result.add(user);
            }
        }
        System.out.println(result);
    }
}
