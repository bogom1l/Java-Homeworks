import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Book[] books = new Book[10];

        final int startingYear = 2000;

        for (int i = 0; i < 10; i++) {
            books[i] = new Book();

            books[i].setAuthorFirstName("FirstName" + String.valueOf(i));
            books[i].setAuthorLastName("LastName" + String.valueOf(i));
            books[i].setTitle("Title" + String.valueOf(i));
            books[i].setYear(startingYear + i);
            books[i].setPages((i + 1) * 20);
        }

        System.out.println("All the books are: ");

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }

        System.out.println("Please enter the year you want to search: ");
        int yearToSearchBeyond = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < books.length; i++) {
            if(yearToSearchBeyond < books[i].getYear()) {
                System.out.println(books[i]);
                sum++;
            }
        }

        System.out.println("Total books found: " + sum);
    }
}