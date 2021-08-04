
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=Integer.valueOf(scanner.nextLine());
        int b=Integer.valueOf(scanner.nextLine());
        int result=a+b;
        double squareRoot = Math.sqrt(result);
        System.out.println(squareRoot);
        

    }
}
