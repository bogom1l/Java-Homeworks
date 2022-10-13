public class Main {
    public static void main(String[] args) {

        StudentGroup[] studentGroups = new StudentGroup[10];
        int courseCounter = 1;

        for (int i = 0; i < 10; i++) {
            studentGroups[i] = new StudentGroup();

            studentGroups[i].setSpecialty("Specialty" + String.valueOf(i));
            studentGroups[i].setCourse(courseCounter);
            studentGroups[i].setGroupNumber(i + 1);
            studentGroups[i].setCountStudents((i + 1) * 3);

            courseCounter++;
            if(courseCounter == 5) {
                courseCounter = 1;
            }
        }

        System.out.println("All the students groups are: ");
        for (int i = 0; i < studentGroups.length; i++) {
            System.out.println(studentGroups[i]);
        }

        int firstCourseCountStudents = 0;
        int secondCourseCountStudents = 0;
        int thirdCourseCountStudents = 0;
        int forthCourseCountStudents = 0;

        for (int i = 0; i < studentGroups.length; i++) {
            StudentGroup currStudentGroup = studentGroups[i];

            if(currStudentGroup.getCourse() == 1) {
                firstCourseCountStudents += currStudentGroup.getCountStudents();
            }
            else if(currStudentGroup.getCourse() == 2) {
                secondCourseCountStudents += currStudentGroup.getCountStudents();
            }
            else if(currStudentGroup.getCourse() == 3) {
                thirdCourseCountStudents += currStudentGroup.getCountStudents();
            }
            else if(currStudentGroup.getCourse() == 4) {
                forthCourseCountStudents += currStudentGroup.getCountStudents();
            }
        }

        System.out.println("First course number of students: " + firstCourseCountStudents);
        System.out.println("Second course number of students: " + secondCourseCountStudents);
        System.out.println("Third course number of students: " + thirdCourseCountStudents);
        System.out.println("Forth course number of students: " + forthCourseCountStudents);

        int[] arr = {firstCourseCountStudents, secondCourseCountStudents, thirdCourseCountStudents, forthCourseCountStudents};

        int max = firstCourseCountStudents;

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println();
        System.out.println("The Most Students Count is: " + max);
    }
}