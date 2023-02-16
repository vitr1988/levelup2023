package ru.levelup.lesson5.abstractcl;

public class AccountRunner {

    public static void main(String[] args) {
        Account ivanovVitaliiAccount = new PersonalAccount("Ivanov Vitalii", "13243243", 100_000);
        Account levelUpAccount = new LegalAccount("LevelUp", "2434324324", 100_000_000);
        for (Account account : new Account[] {ivanovVitaliiAccount, levelUpAccount}) {
            System.out.println(account.taxes());
        }

//        Account account = new Account("", 0);
    }
}
