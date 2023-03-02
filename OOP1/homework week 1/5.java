import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input day of the week: ");
        String day = in.next().toLowerCase();
        //System.out.println(day);

        switch(day) {
            case "monday":
                System.out.println("Working hours today: from 13:30 to 18:00.");
                break;
            case "tuesday":
                System.out.println("Working hours today: from 08:00 to 12:30.");
                break;
            case "wednesday":
                System.out.println("Working hours today: from 13:30 to 18:00.");
                break;
            case "thursday":
                System.out.println("Working hours today: from 08:00 to 12:30.");
                break;
            case "friday":
                System.out.println("Working hours today: from 13:30 to 18:00.");
                break;
            case "saturday":
                System.out.println("Today we dont work.");
                break;
            case "sunday":
                System.out.println("Today we dont work.");
                break;
            default:
                System.out.println("Invalid day!");
                break;
        }



    }
}