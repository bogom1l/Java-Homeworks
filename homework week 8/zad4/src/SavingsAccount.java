package bg.tu_varna.sit.task4;

public class SavingsAccount extends Account{

    public SavingsAccount(AccountHolder accountHolder, Currency currency, double balance) {
        super(accountHolder, currency, balance);
    }

    @Override
    public double calculateAccountInterest() {
        if(this.accountHolder.getAge() > 62 && this.currency == Currency.BGN) {
            return this.balance * 0.08;
        }
        else if(this.currency == Currency.BGN) {
            return this.balance * 0.05;
        }
        else if(this.currency == Currency.USD) {
            return this.balance * 0.025;
        }
        return this.balance * 0.005;
    }
}
