package ru.levelup.lesson9;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteRunner {

    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("test.txt", true)) {
            fileWriter.append("Привет,");
            fileWriter.append(" Мир ");
            fileWriter.append("!");
            fileWriter.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
