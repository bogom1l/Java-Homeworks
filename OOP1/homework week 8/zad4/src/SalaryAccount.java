package bg.tu_varna.sit.task4;

public class SalaryAccount extends Account{

    public SalaryAccount(AccountHolder accountHolder, Currency currency, double balance) {
        super(accountHolder, currency, balance);
    }

    @Override
    public double calculateAccountInterest() {
        if(this.accountHolder.getAge() < 62 && this.accountHolder.getAge() > 25) {
            return this.balance * 0.08;
        }
        return this.balance * 0.04;
    }
}
