public class CompanyLtd extends Company{

    private String ownerName;
    private int startingCapital;
    private int actualCapital;

    public CompanyLtd(String name, String date, String bulstat, String ownerName, int startingCapital, int actualCapital) {
        super(name, date, bulstat);
        this.ownerName = ownerName;
        this.startingCapital = startingCapital;
        this.actualCapital = actualCapital;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getStartingCapital() {
        return startingCapital;
    }

    public int getActualCapital() {
        return actualCapital;
    }

    public void setActualCapital(int actualCapital) {
        this.actualCapital = actualCapital;
    }

    public int findDifferenceInCapital() {
        return this.actualCapital - this.startingCapital;
    }

}
