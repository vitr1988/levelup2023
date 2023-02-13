package ru.levelup.lesson4.account;

public class AccountRunner {

    public static void main(String[] args) {
        Account account = new Account();
//        account.id = 1;
//        account.accountNumber = "40124321313";
//        account.balance = 0;
//        account.owner = "Ivanov Vitalii";
        account.setId(1);
        account.setAccountNumber("40124321313");
        account.setBalance(0);
        account.setOwner("Ivanov Vitalii");

        Account account2 = new Account("Petrov Petr");

        Account account3 = new Account(0, "Petrov Petr");
//        account3 = account2;

        System.out.println(account2 == account3);

        account.deposit(10_000);
        account.withdraw(5_000);
        account.deposit(7_000);
        account.withdraw(27_000);
//        System.out.println("Текущий остаток по счету " + account.balance);
//        System.out.println("Текущий остаток по счету " + account.getBalance());

        account.setOwner("Sidorov Victor");
    }
}
