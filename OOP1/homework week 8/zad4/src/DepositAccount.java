package bg.tu_varna.sit.task4;

public class DepositAccount extends Account{

    public DepositAccount(AccountHolder accountHolder, Currency currency, double balance) {
        super(accountHolder, currency, balance);
    }

    @Override
    public double calculateAccountInterest() {
        if(this.currency == Currency.BGN) {
            return this.balance * 0.05;
        }
        else if(this.currency == Currency.USD) {
            return this.balance * 0.02;
        }
        return this.balance * 0.01;
    }
}
