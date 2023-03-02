package bg.tu_varna.sit.task5;

public class SalaryAccount extends Account{

    SalaryAccount(int id, AccountType accountType, Currency currency, double balance) {
        super(id, accountType, currency, balance);
    }

    @Override
    public double calculateInterestValue() {
        if(this.accountType == AccountType.CORPORATE) {
            return 0;
        }
        if(this.currency == Currency.BGN) {
            return this.balance * 0.05;
        }
        if(this.currency == Currency.USD) {
            return this.balance * 0.03;
        }
        if(this.currency == Currency.EUR) {
            return this.balance * 0.02;
        }
        return this.balance * 0.01;
    }

    @Override
    public String toString() {
        return "SalaryAccount{" +
                "id=" + id +
                ", accountType=" + accountType +
                ", currency=" + currency +
                ", balance=" + balance +
                '}';
    }
}
