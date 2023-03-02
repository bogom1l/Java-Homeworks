public class Employee extends Human{
    protected String name;
    protected int hours;
    protected double salaryPerHour;

    public double basicSalary() {
        return this.hours * this.salaryPerHour;
    }

    public Employee(String fName, String sName, String lName, String gender, int age, int hours, double salaryPerHour) {
        super(fName, sName, lName, gender, age);
        this.name = fName + " " + sName + " " + lName;
        this.hours = hours;
        this.salaryPerHour = salaryPerHour;
    }

    protected Employee(String name, int hours, double salaryPerHour) {
        this.name = name;
        this.hours = hours;
        this.salaryPerHour = salaryPerHour;
    }
}
