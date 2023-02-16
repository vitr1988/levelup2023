package ru.levelup.lesson5.abstractcl;

public class LegalAccount extends Account {

    private String companyName;

    public LegalAccount(String companyName, String accountNumber, double balance) {
        super(accountNumber, balance);
        this.companyName = companyName;
    }

    @Override
    public double taxes() {
        return 0.2;
    }
}
