
import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.valueOf(scanner.nextLine());
        printUntilNumber(a);

    }

    public static void printUntilNumber(int numOfTimes) {
        int i = 0;
        while (i < numOfTimes) {
            System.out.println(i + 1);
            i++;
        }
    }

}
