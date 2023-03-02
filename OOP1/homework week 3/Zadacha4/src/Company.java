public class Company {

    protected String name;
    protected String date;
    protected String bulstat;

    public Company(String name, String date, String bulstat) {
        this.name = name;
        this.date = date;
        this.bulstat = bulstat;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getBulstat() {
        return bulstat;
    }
}
