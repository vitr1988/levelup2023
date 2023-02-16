package ru.levelup.lesson5.abstractcl;

public final class PersonalAccount extends Account {

    private final String fullName// = "100"
    ;

    public PersonalAccount(String fullName, String accountNumber, double balance) {
        super(accountNumber, balance);
        this.fullName = fullName;
    }

    @Override
    public double taxes() {
        return 0;
    }
}
