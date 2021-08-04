
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=1;
        System.out.println("Give a number:");
        int n=Integer.valueOf(scanner.nextLine());
        for(int i=1;i<=n;i++){
            count=count*i;
            
        }
        System.out.println(count);
            

    }
}
