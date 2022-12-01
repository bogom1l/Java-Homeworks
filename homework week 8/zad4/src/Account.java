package bg.tu_varna.sit.task4;

public abstract class Account implements InterestCalculator{
    AccountHolder accountHolder;
    Currency currency;
    double balance;

    public Account(AccountHolder accountHolder, Currency currency, double balance) {
        this.accountHolder = accountHolder;
        this.currency = currency;
        this.balance = balance;
    }

    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getBalance() {
        return balance;
    }
}
