package bg.tu_varna.sit.task5;

public class SavingsAccount extends Account{

    SavingsAccount(int id, AccountType accountType, Currency currency, double balance) {
        super(id, accountType, currency, balance);
    }

    @Override
    public double calculateInterestValue() {
        if(this.accountType == AccountType.PERSONAL && this.currency == Currency.BGN) {
            return this.balance * 0.15;
        }
        if(this.currency == Currency.BGN) {
            return this.balance * 0.05;
        }
        if(this.currency == Currency.USD) {
            return this.balance * 0.1;
        }
        return this.balance * 0.01;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "id=" + id +
                ", accountType=" + accountType +
                ", currency=" + currency +
                ", balance=" + balance +
                '}';
    }
}
