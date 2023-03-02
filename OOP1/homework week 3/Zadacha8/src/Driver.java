public class Driver extends Employee{
    private DrivingLicense drivingLicense;
    private int coursesPerDay;

    public Driver(String name, int hours, double salaryPerHour, DrivingLicense drivingLicense, int coursesPerDay) {
        super(name, hours, salaryPerHour);
        this.drivingLicense = drivingLicense;
        this.coursesPerDay = coursesPerDay;
    }

    public double driverSalary() {
        if(this.coursesPerDay > 10) {
            double value = basicSalary();
            return  value *= 0.5;
        }
        return basicSalary();
    }
}
