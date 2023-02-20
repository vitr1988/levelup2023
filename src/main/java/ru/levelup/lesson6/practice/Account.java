package ru.levelup.lesson6.practice;

public class Account implements Cloneable {

    private String accountNumber;
    private double balance;
    private Owner owner;

    public Account(String accountNumber, double balance, String owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = new Owner(owner);
    }

    @Override
    public Account clone() throws CloneNotSupportedException {
        Account clone = (Account) super.clone();
        clone.owner = clone.owner.clone();
        return clone;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", owner=" + owner +
                '}';
    }

    public static class Owner implements Cloneable {
        private String fullName;

        public Owner(String fullName) {
            this.fullName = fullName;
        }

        @Override
        protected Owner clone() throws CloneNotSupportedException {
            return (Owner) super.clone();
        }

        @Override
        public String toString() {
            return "Owner{" +
                    "fullName='" + fullName + '\'' +
                    '}';
        }
    }
}
