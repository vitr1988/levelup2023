package ru.levelup.lesson5.abstractcl;

public abstract class Account {

    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit() {

    }

    public void withdraw() {

    }

    public abstract double taxes();
}
