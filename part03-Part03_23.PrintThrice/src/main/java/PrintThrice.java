
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a word:");
        String name = scanner.nextLine();
        String a= name+name+name;
        System.out.println(a);

        // Write your program here

    }
}
