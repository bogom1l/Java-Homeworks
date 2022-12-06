package bg.tu_varna.sit.task5;

public class DepositAccount extends Account{

    public DepositAccount(int id, AccountType accountType, Currency currency, double balance) {
        super(id, accountType, currency, balance);
    }

    @Override
    public double calculateInterestValue() {
        if(this.accountType == AccountType.PERSONAL) {
            return this.balance * 0.09;
        }
        if(this.currency == Currency.BGN) {
            return this.balance * 0.07;
        }
        if(this.currency == Currency.USD) {
            return this.balance * 0.05;
        }
        if(this.currency == Currency.EUR) {
            return this.balance * 0.02;
        }
        return this.balance * 0.01;
    }

    @Override
    public String toString() {
        return "DepositAccount{" +
                "id=" + id +
                ", accountType=" + accountType +
                ", currency=" + currency +
                ", balance=" + balance +
                '}';
    }
}
