
public class Smallest {

    public static int smallest(int number1, int number2) {
        if (number1 > number2) {
            return number2;
        } else {
            return number1;
        }
        // Write some code here
        // don't print anything inside this method
        // there must be a return in the end of the method

    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}
