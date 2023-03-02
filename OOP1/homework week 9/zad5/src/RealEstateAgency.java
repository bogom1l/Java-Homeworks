package bg.tu_varna.sit.task5;

import java.util.ArrayList;

public class RealEstateAgency {
    ArrayList<Account> accounts;

    public RealEstateAgency() {
        this.accounts = new ArrayList<Account>();
    }

    public void createAccount(Account account) {
        if(!this.accounts.contains(account)) {
            this.accounts.add(account);
        }
    }

    public void closeAccount(Account account) {
        if(this.accounts.contains(account)) {
            this.accounts.remove(account);
        }
    }
    
    public int calculateNumberOfSalaryAccounts() {
        int sum = 0;
        for (Account account :
                this.accounts) {
            if(account.getClass() == SalaryAccount.class)  {
                sum++;
            }
        }
        return sum;
    }

    public double calculateAverageInterestByCurrency(Currency currency) {
        double sum = 0;
        for (Account account :
                this.accounts) {
            sum += account.calculateInterestValue();
        }
        return sum/this.accounts.size();
    }

    public double findHighestInterest() {
        double highest = 0;
        for (Account account :
                this.accounts) {
            if(highest < account.calculateInterestValue()) {
                highest = account.calculateInterestValue();
            }
        }
        return highest;
    }

    @Override
    public String toString() {
        String result = "";
        for (Account account :
                this.accounts) {
            result+=(account) + "\n";
        }
        return result;
    }
}
