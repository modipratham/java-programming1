
import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.valueOf(scanner.nextLine());
        printFromNumberToOne(a);

    }

    public static void printFromNumberToOne(int numOfTimes) {
        int i = numOfTimes;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
    }

}
