
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int a = Integer.valueOf(scan.nextLine());
        if (a >= 5000 && a < 25000) {
            double result = 100 + (a - 5000) * 0.08;
            System.out.println("Tax: " + result);
        } else if (a >= 25000 && a < 55000) {
            double result = 1700 + (a - 25000) * 0.1;
            System.out.println("Tax: " + result);
        } else if (a >= 55000 && a < 200000) {
            double result = 4700 + (a - 55000) * 0.12;
            System.out.println("Tax: " + result);
        } else if (a >= 200000 && a < 1000000) {
            double result = 22100 + (a - 200000) * 0.15;
            System.out.println("Tax: " + result);
        } else if (a >= 1000000) {
            double result = 142100 + (a - 1000000) * 0.17;
            System.out.println("Tax: " + result);
        } else if (a < 5000) {

            System.out.println("No tax!");
        }

    }
}
