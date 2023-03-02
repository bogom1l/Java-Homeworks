package bg.tu_varna.sit.task1;

public class IdentificationCard {
    private int number;
    private int year;
    private String eng;
    private City city;

    public String publishedBy() {
        return "MVR: " + this.city.getName();
    }

    public int validUntil() {
        return this.year+10;
    }

    public int getNumber() {
        return number;
    }
}
