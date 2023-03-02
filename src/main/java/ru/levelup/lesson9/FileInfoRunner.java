package ru.levelup.lesson9;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileInfoRunner {

    public static void main(String[] args) throws Exception {
        File file = new File("test.txt");
        System.out.println("Путь до файла: " + file.getPath());
        System.out.println("Это файл: " + (file.isFile() ? "да" : "нет"));
        if (!file.exists()) {
            boolean newFile = file.createNewFile();
        }
        Files.delete(Paths.get("test.txt"));
    }
}
