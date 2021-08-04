
import java.util.Scanner;



public class Division {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=Integer.valueOf(scan.nextLine());
        int b=Integer.valueOf(scan.nextLine());
        division(a,b);
        
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"

        // division(3, 5);
    }
    public static void division(int numerator, int denominator){
        float div= (float)numerator/denominator;
        System.out.println(div);
    }

    // implement the method here
}
