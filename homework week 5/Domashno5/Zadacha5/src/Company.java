package bg.tu_varna.sit.task5;

public abstract class Company {
    protected String name;
    protected String EIK;
    protected double incomes;
    protected double costs;

    abstract double dyljimDanyk();

    public String getName() {
        return name;
    }

    public String getEIK() {
        return EIK;
    }

    public double getIncome() {
        return incomes;
    }

    public double getCosts() {
        return costs;
    }
}
