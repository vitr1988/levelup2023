package ru.levelup.lesson3;

import java.util.Arrays;
import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4, 5};
        int[] anotherDigits = new int[]{1, 2, 3, 4, 5};
        System.out.println("Третий элемент (с индексом 2) равен " + digits[2]);
        for (int i = 0; i < digits.length; i++) {
            System.out.println("Элемент с индексом " + i + " равен " + digits[i]);
        }
        int[] ints = {17, 25, 145, -1, 13, 0, 29, 133};
        System.out.println("Максимальный элемент в массиве " + Arrays.toString(ints) + " равен " + max(ints));
//        int anotherDigits[];
        int size = 100;
        int[] bigDigits = new int[size];
        System.out.println(Arrays.toString(bigDigits));
        for (int i = 1; i <= size; i++) {
            bigDigits[i - 1] = i;
        }
        int[] copyOfBigDigits = new int[200];
        int counter = 0;
//        for (int currentValue: bigDigits) {
//            copyOfBigDigits[counter++] = currentValue;
//        }
        System.arraycopy(bigDigits, 0, copyOfBigDigits, 99, bigDigits.length);

        System.out.println(Arrays.toString(bigDigits));
        System.out.println(Arrays.toString(copyOfBigDigits));

        int[][] matrix = new int[2][2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = new Random().nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int max(int[] arrays) {
        int result = arrays[0];
        for (int currentValue: arrays) { // итерируемся в массиве по значению
            if (result < currentValue) { // проверяем, что текущий элемент превышает буферный максимум
                result = currentValue;   // переинициализация текущего максимума
            }
        }
        return result;
    }
}
