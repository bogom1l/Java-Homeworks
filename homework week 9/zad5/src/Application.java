package bg.tu_varna.sit.task5;

public class Application {
    public static void main(String[] args) {

        try {
            DepositAccount depositAccount1 = new DepositAccount(1,AccountType.PERSONAL,Currency.USD,100);
            DepositAccount depositAccount2 = new DepositAccount(2,AccountType.CORPORATE,Currency.EUR,500);

            SalaryAccount salaryAccount1 = new SalaryAccount(3,AccountType.CORPORATE,Currency.BGN,123);
            SalaryAccount salaryAccount2 = new SalaryAccount(4,AccountType.CORPORATE,Currency.EUR,77777);

            SavingsAccount savingsAccount1 = new SavingsAccount(5,AccountType.CORPORATE, Currency.BGN, 111);
            SavingsAccount savingsAccount2 = new SavingsAccount(6,AccountType.PERSONAL, Currency.EUR, 2222);

            RealEstateAgency realEstateAgency = new RealEstateAgency();

            realEstateAgency.createAccount(depositAccount1);
            realEstateAgency.createAccount(depositAccount2);
            realEstateAgency.createAccount(salaryAccount1);
            realEstateAgency.createAccount(salaryAccount2);
            realEstateAgency.createAccount(savingsAccount1);
            realEstateAgency.createAccount(savingsAccount2);

            realEstateAgency.closeAccount(savingsAccount2);

            System.out.println(realEstateAgency.calculateNumberOfSalaryAccounts());
            System.out.println(realEstateAgency.calculateAverageInterestByCurrency(Currency.BGN));
            System.out.println(realEstateAgency.findHighestInterest());

            System.out.println(realEstateAgency);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}