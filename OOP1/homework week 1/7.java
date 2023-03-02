import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int firstYearCount = 0;
        int secondYearCount = 0;
        int thirdYearCount = 0;
        int forthYearCount = 0;
        int undentifiedCount = 0;

        long array[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < 10; i++) {

            long currFN = in.nextLong();

            String numToString = String.valueOf(currFN);

            if(numToString.length() < 7){
                System.out.println("invalid input. breaking the program.");
                return;
            }

            char firstDigit = numToString.charAt(0);
            char secondDigit = numToString.charAt(1);

            if(firstDigit == '2' && secondDigit == '2'){
                firstYearCount++;
            }
            else if(firstDigit == '2' && secondDigit == '1'){
                secondYearCount++;
            }
            else if(firstDigit == '2' && secondDigit == '0'){
                thirdYearCount++;
            }
            else if(firstDigit == '1' && secondDigit == '9'){
                forthYearCount++;
            }
            else{
                undentifiedCount++;
            }
        }

        System.out.println("Students in first year: " + firstYearCount);
        System.out.println("Students in second year: " + secondYearCount);
        System.out.println("Students in third year: " + thirdYearCount);
        System.out.println("Students in forth year: " + forthYearCount);
        System.out.println("Undentified students count: " + undentifiedCount);

    }
}