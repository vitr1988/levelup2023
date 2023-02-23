package ru.levelup.lesson7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionRunner {

    public static void main(String[] args) throws FileNotFoundException {
//        try {
            FileInputStream fileInputStream = new FileInputStream("result.txt");
//        } catch (FileNotFoundException e) {
//            System.out.println("Файла нет:" + e.getMessage());
//            return;
//        }
    }
}
