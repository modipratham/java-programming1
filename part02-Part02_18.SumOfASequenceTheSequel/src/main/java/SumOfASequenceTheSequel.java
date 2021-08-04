
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        System.out.println("First number?");
        int a = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int b = Integer.valueOf(scanner.nextLine());
        
        for (int i = a; i <= b; i++) {
            count=count+i;
            
        }
        System.out.println(count);

    }
}
