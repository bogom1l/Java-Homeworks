package bg.tu_varna.sit.task4;

public class Application {
    public static void main(String[] args) {

        AccountHolder accountHolder1 = new AccountHolder("aaa","bbb",28);
        AccountHolder accountHolder2 = new AccountHolder("www","qqq",77);

        DepositAccount depositAccount = new DepositAccount(accountHolder1,Currency.EUR,1000);
        SavingsAccount savingsAccount = new SavingsAccount(accountHolder2, Currency.USD, 500);
        SalaryAccount salaryAccount = new SalaryAccount(accountHolder2, Currency.BGN, 800000);

        System.out.println(depositAccount.calculateAccountInterest());
        System.out.println(savingsAccount.calculateAccountInterest());
        System.out.println(salaryAccount.calculateAccountInterest());


    }
}