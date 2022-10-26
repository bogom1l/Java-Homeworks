public class IdentificationCard {
    private int number;
    private int year;
    private String egn;
    private City city;

    public IdentificationCard(int number, int year, String egn, City city) {
        this.number = number;
        this.year = year;
        this.egn = egn;
        this.city = city;
    }
    public int getNumber() {
        return number;
    }

    public String getEgn() {
        return egn;
    }

    public String publishedBy() {
        return "МВР: " + this.city.getName();
    }

    public int validUntil() {
        return this.year + 10;
    }
}
