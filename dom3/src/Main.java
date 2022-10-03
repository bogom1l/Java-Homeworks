public class Main {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 200; i++) {
            if(i % 2 == 0){
                sum += i;
            }
        }

        int sum2 = 0;

        for (int i = 1; i <= 200; i++) {
            if(i % 7 == 0){
                sum2 += i;
            }
        }

        System.out.println("Sum = " + sum);
        System.out.println("Sum2 = " + sum2);
    }
}