import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input side1: ");
        double a = in.nextDouble();

        System.out.print("Input side2: ");
        double b = in.nextDouble();

        System.out.print("Input side3: ");
        double c = in.nextDouble();

        boolean isValid = isValidTriangle(a, b, c);
        boolean isRight = isRightTriangle(a, b, c);

        System.out.println("Is the triangle valid? -> " + isValid);

        if(isValid){
            System.out.println("Is the triangle right? -> " + isRight);
        }
        else {
            System.out.println("The triangle doesnt exist! ");
        }

    }

    public static boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c && b + c > a && c + a > b);
    }

    public static boolean isRightTriangle(double a, double b, double c) {

        double aPowered = Math.pow(a, 2);
        double bPowered = Math.pow(b, 2);
        double cPowered = Math.pow(c, 2);

        if(aPowered + bPowered != cPowered){
            return false;
        }
        if(aPowered + cPowered != bPowered) {
            return false;
        }
        if(bPowered + cPowered != aPowered) {
            return false;
        }

        return true;
    }
}