import java.util.Objects;

public class Student {
    private String firstName;
    public Student(String firstName, String lastName, String facNumber, String specialty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.facNumber = facNumber;
        this.specialty = specialty;
    }
    private String lastName;
    private String facNumber;
    private String specialty;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFacNumber() {
        return facNumber;
    }

    public void setFacNumber(String facNumber) {
        this.facNumber = facNumber;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(facNumber, student.facNumber);
    }

    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", facNumber='" + facNumber + '\'' +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
