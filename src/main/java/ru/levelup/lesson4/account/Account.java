package ru.levelup.lesson4.account;

public class Account {

    private long id; //0
    private String accountNumber = null;
    private double balance; // default = 0.0 .... BigDecimal
    private String owner = null;

    public Account() {

    }

    public Account(String owner) {
//        this();
        this.owner = owner;
//        this.owner = owner;
    }

    public Account(double balance, String owner) {
        this(owner); //this.owner = owner;
        this.balance = balance;
    }

    public Account(Account account) {
        this(account.balance, account.owner);
//        this.balance = account.balance;
//        this.owner = account.owner;
        this.id = account.id;
        this.accountNumber = account.accountNumber;
        this.deposit(100_000);
    }

    public void deposit(double value) {
//        balance += value;
        this.withdraw(-value);
    }

    public void withdraw(double value) {
        if (balance >= value) { // проверка на достаточность баланса
            balance -= value;
        } else {
            System.out.println("Операция снятия средств невозможна. Попытка снятия " + value);
            printBalance();
        }
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return this.balance;
    }

    private void printBalance() {
        System.out.println("Текущий баланс по счету " + accountNumber + " составляет " + balance);
    }
}
