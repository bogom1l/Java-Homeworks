import java.util.Objects;
public class Account {

    private String number;
    private String currency;
    private String availability;
    private String typeOfAcc;

    public Account(String number, String currency, String availability, String typeOfAcc) {
        this.number = number;
        this.currency = currency;
        this.availability = availability;
        this.typeOfAcc = typeOfAcc;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getTypeOfAcc() {
        return typeOfAcc;
    }

    public void setTypeOfAcc(String typeOfAcc) {
        this.typeOfAcc = typeOfAcc;
    }

    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", currency='" + currency + '\'' +
                ", availability='" + availability + '\'' +
                ", typeOfAcc='" + typeOfAcc + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(currency, account.currency) && Objects.equals(availability, account.availability);
    }
}
