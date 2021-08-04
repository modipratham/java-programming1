
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        System.out.println("Last number?");
        int a=Integer.valueOf(scanner.nextLine());
        for(int i=0;i<=a;i++){
            count+=i;
            
        }
        System.out.println(count);

    }
}
