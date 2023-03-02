package ru.levelup.lesson9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadRunner {

    public static void main(String[] args) {
        try(BufferedReader fileReader = new BufferedReader(new FileReader("test.txt"))) {
            String word;
            while((word = fileReader.readLine()) != null) {
                System.out.println(word);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Здесь ваша реклама");
    }
}
