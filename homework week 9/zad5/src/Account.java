package bg.tu_varna.sit.task5;

import java.util.Objects;

public abstract class Account implements InterestCalculator{
    int id;
    AccountType accountType;
    Currency currency;
    double balance;

    Account(int id, AccountType accountType, Currency currency, double balance) {
        this.id = id;
        this.accountType = accountType;
        this.currency = currency;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return id == account.id;
    }

}
