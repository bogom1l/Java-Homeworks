public class Main {
    public static void main(String[] args) {


        DrivingLicense drivingLicense = new DrivingLicense(123, 4);

        Human human = new Human("ivan", "petrov", "georgiev", "male", 25);

        Employee employee = new Employee("Petur Ivanov Marinov", 15, 5.3);

        Driver driver = new Driver("Koko Don Stoqnov", 12,6,drivingLicense,12);

        Engineer engineer = new Engineer("A B C", 6,20,6);

        System.out.println(employee.basicSalary());
        System.out.println(driver.basicSalary());
        System.out.println(engineer.basicSalary());

    }

}