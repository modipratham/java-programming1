
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String m = reader.nextLine();
        System.out.println("What is their job?");
        String n = reader.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was "+m+", who was "+n+".");
        System.out.println("On the way to work, "+m+" reflected on life.");
        System.out.println("Perhaps "+m+" will not be "+n+" forever.");
        
        

        // Write your program here

    }
}
