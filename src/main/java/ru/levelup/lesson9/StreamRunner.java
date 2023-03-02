package ru.levelup.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class StreamRunner {
    public static void main(String[] args) {
        PrintStream out = System.out;
        out.println("Введите число:");
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.next();
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
//        BufferedReader reader = null;
//        try {
//            reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))
//            String input = reader.readLine();
//            System.out.println(input);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            try {
//                if (reader != null) {
//                    reader.close();
//                }
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
            String input = reader.readLine();
            System.out.println(input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        reader.close();// делать не стоит
    }
}
