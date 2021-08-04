
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanne = new Scanner(System.in);
        
        
        
            System.out.println("Which file should have its contents printed?");
            String a =scanne.nextLine();
            try (Scanner scanner = new Scanner(Paths.get(a))) {

    // we read the file until all lines have been read
    while (scanner.hasNextLine()) {
        // we read one line
        String row = scanner.nextLine();
        // we print the line that we read
        System.out.println(row);
    }
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}

    }
}
