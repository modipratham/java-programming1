
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int val=Integer.valueOf(scanner.nextLine());
        int sec= 3600*24*val;
        System.out.println(sec);

        // Write your program here

    }
}
