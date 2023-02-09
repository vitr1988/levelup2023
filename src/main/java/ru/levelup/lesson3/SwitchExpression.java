package ru.levelup.lesson3;

public class SwitchExpression {

    public static void main(String[] args) {
        int color = 1;//(int) (Math.random() * 10);
        System.out.println(color);
        System.out.println("------");
        semaphore(color);
//        System.out.println(semaphoreV2(color));
    }

    public static void semaphore(int color) {
        switch (color) {
            case 0: // red
                System.out.println("Проход запрещен!");
                break;
            case 1: // yellow
                System.out.println("Будьте осторожны");
                break;
            case 2: // green
            case 3:
            case 6: {
                System.out.println("Можно идти!");
                break;
            }
            default:
                System.out.println("Такого цвета нет");
                break;
        }
    }

    public static String semaphoreV2(int color) {
        switch (color) {
            case 0: // red
                return "Проход запрещен!";
            case 1: // yellow
                return "Будьте осторожны";
            case 2: // green
                return "Можно идти!";
            default:
                return "Такого цвета нет";
        }
    }
}
