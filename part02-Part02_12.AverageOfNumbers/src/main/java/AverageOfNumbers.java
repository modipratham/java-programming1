
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int point = 0;
        double avg=0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            } else {
                count += number;
                point = point + 1;
                avg=(double)count/point;
            }

        }
        System.out.println("Average of the numbers: " + avg);
        

    }
}
