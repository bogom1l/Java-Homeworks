public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[10];

        students[0] = new Student("Ivan", "Ivanov", "11111111", "SIT");
        students[1] = new Student("Petar", "Ivanov", "22222222", "SIT");
        students[2] = new Student("Georgi", "Georgiev", "33333333", "KST");
        students[3] = new Student("Bobi", "Petkov", "44444444", "AT");
        students[4] = new Student("Georgi", "Malinov", "55555555", "SIT");
        students[5] = new Student("Anna", "Ioanova", "66666666", "SIT");
        students[6] = new Student("Borislav", "Kamenov", "777777777", "AT");
        students[7] = new Student("Kamen", "Ivanov", "888888888", "KST");
        students[8] = new Student("Pesho", "Stamenov", "99999999", "KST");
        students[9] = new Student("Andrei", "Kaloqnov", "12312312", "SIT");

        //printing out the array
        for (int i = 0; i < students.length; i++) {
            Student currStudent = students[i];

            System.out.println(currStudent);
        }

        //search by LastName
        String lastNameToSearchFor = "Ivanov";
        int sum = 0;

        System.out.println("Found the following students with that last name: ");
        for (int i = 0; i < students.length; i++) {
            Student currStudent = students[i];

            String currStudentLastName = currStudent.getLastName();

            if(currStudentLastName.equals(lastNameToSearchFor)){
                System.out.println(currStudent);
                sum++;
            }
        }

        if(sum == 0){
            System.out.println("None of the students has that last name!");
        }

    }
}