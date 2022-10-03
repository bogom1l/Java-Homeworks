import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //{670.50, 687.22, 691.05, 710.56, 750.82, 788.44, 765.97, 698.36, 778,78}

        double array[] = {670.50, 687.22, 691.05, 710.56, 750.82, 788.44, 765.97, 698.36, 778,78};

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = sum / 9;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > average){
                System.out.println("Month number (starting from 0): " + i);
            }
        }

    }
}