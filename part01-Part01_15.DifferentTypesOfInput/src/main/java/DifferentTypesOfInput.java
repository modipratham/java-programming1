
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:");
        String value= scan.nextLine();
        System.out.println("Give an integer:");
        int a= Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double floatingPoint = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean trueOrFalse = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string "+value);
        System.out.println("You gave the integer "+a);
        System.out.println("You gave the double "+floatingPoint);
        System.out.println("You gave the boolean "+trueOrFalse);
        
        

        // Write your program here

    }
}
