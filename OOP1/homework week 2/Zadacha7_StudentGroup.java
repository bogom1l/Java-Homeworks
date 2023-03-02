import java.util.Objects;

public class StudentGroup {

    private String specialty;
    private int course;
    private int groupNumber;
    private int countStudents;

    public StudentGroup() {
    }

    public StudentGroup(String specialty, int course, int groupNumber, int countStudents) {
        this.specialty = specialty;
        this.course = course;
        this.groupNumber = groupNumber;
        this.countStudents = countStudents;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getCountStudents() {
        return countStudents;
    }

    public void setCountStudents(int countStudents) {
        this.countStudents = countStudents;
    }

    public String toString() {
        return "StudentGroup{" +
                "specialty='" + specialty + '\'' +
                ", course=" + course +
                ", groupNumber=" + groupNumber +
                ", countStudents=" + countStudents +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentGroup that = (StudentGroup) o;
        return course == that.course
                && groupNumber == that.groupNumber
                && countStudents == that.countStudents
                && Objects.equals(specialty, that.specialty);
    }
}
