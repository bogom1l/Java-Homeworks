public class Engineer extends Employee{
    private int machinesBuiltPerDay;

    public Engineer(String name, int hours, double salaryPerHour, int machinesBuiltPerDay) {
        super(name, hours, salaryPerHour);
        this.machinesBuiltPerDay = machinesBuiltPerDay;
    }

    public double engineerSalary() {
        return basicSalary() * ((0.001 * this.salaryPerHour) * this.machinesBuiltPerDay);
    }
}
