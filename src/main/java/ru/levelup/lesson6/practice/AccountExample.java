package ru.levelup.lesson6.practice;

public class AccountExample {

    public static void main(String[] args) throws Exception {
        Account vitaliiAccount = new Account("13243", 1000, "Ivanov Vitalii");
        Account clone = vitaliiAccount.clone();
        System.out.println("Счет 1: " + vitaliiAccount);
        System.out.println("Счет 2: " + clone);
    }

}
