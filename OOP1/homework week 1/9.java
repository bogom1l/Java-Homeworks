public class Main {
    public static void main(String[] args) {

        double[] arr = {6.6, 50, 12.2, 13.5, 7.4, 8.8, 9.0, 10.0, 6.0, 2.0 };

        if(arr.length < 3){
            System.out.println("Invalid input! The array size must be atleast 3 !");
        }

        double first = -1;
        double second = -1;
        double third = -1;

        for (int i = 0; i < arr.length; i++) {
            double current = arr[i];

            if(current % 2 != 0) {
                continue;
            }

            if(first < current) {
                third = second;
                second = first;
                first = current;
            }
            else if(second < current) {
                third = second;
                second = current;
            }
            else if(third < current) {
                third = current;
            }

        }

        System.out.println("Biggest three even numbers are: " + first + ", " + second + ", " + third);
    }
}