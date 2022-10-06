public class Main {
    public static void main(String[] args) {

        char[] answers = {'a','b','a','c','a','c','c','b','a','c'};

        char[] exampleAnswers = {'a','a','b','c','a','c','a','b','a','b'};
        int totalPoints = 0;

        for (int i = 0; i < answers.length; i++) {
            if(exampleAnswers[i] == answers[i]){
                totalPoints++;
            }
        }

        if(totalPoints <= 2){
            System.out.println("Your grade is: (2)");
        }
        else if(totalPoints <= 4) {
            System.out.println("Your grade is: (3)");
        }
        else if(totalPoints <= 6) {
            System.out.println("Your grade is: (4)");
        }
        else if(totalPoints <= 8) {
            System.out.println("Your grade is: (5)");
        }
        else if(totalPoints <= 10) {
            System.out.println("Your grade is: (6)");
        }

    }
}