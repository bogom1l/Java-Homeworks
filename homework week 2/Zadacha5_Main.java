import java.util.*;

public class Main {
    public static void main(String[] args) {

        Account[] accounts = new Account[10];

        accounts[0] = new Account("1", "eur", "200", "travel");
        accounts[1] = new Account("2", "usd", "300", "normal");
        accounts[2] = new Account("3", "bgn", "555", "travel");
        accounts[3] = new Account("4", "eur", "900", "normal");
        accounts[4] = new Account("5", "eur", "123", "normal");
        accounts[5] = new Account("6", "usd", "10000", "normal");
        accounts[6] = new Account("7", "usd", "5000", "normal");
        accounts[7] = new Account("8", "bgn", "25", "normal");
        accounts[8] = new Account("9", "bgn", "1", "travel");
        accounts[9] = new Account("10", "eur", "99", "travel");

        System.out.println("All accounts: ");
        for (int i = 0; i < accounts.length; i++) {
            Account currAcc = accounts[i];

            System.out.println(currAcc);
        }

        //search for type of currency
        double sum = 0;
        int counter = 0;
        System.out.println("Please input the type of currency: ");
        Scanner scanner = new Scanner(System.in);
        String typeOfCurrencyToSearchFor = scanner.next();

        for (int i = 0; i < accounts.length; i++) {
            Account currAcc = accounts[i];

            String currAccCurrency = currAcc.getCurrency();

            if(currAccCurrency.equals(typeOfCurrencyToSearchFor)) {
                double currAvailability = Double.valueOf(currAcc.getAvailability());
                sum += currAvailability;
                counter++;
            }
        }

        if(sum == 0) {
            System.out.println("Accounts with that type of currency are not found!");
            return;
        }

        System.out.println("Average availability in the '" + typeOfCurrencyToSearchFor + "' accounts: ");
        System.out.println(sum/counter);

    }
}