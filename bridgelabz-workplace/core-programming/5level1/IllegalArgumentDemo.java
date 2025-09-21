import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {
        // Start index greater than end index will cause IllegalArgumentException
        String sub = text.substring(5, 2); // This will throw exception
        System.out.println("Substring: " + sub);
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text) {
        try {
            String sub = text.substring(5, 2); // Start index > end index
            System.out.println("Substring: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for string
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Demonstrate the exception
        System.out.println("\nDemonstrating IllegalArgumentException:");
        try {
            generateException(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred: " + e);
        }

        // Handle the exception properly
        System.out.println("\nHandling IllegalArgumentException using try-catch:");
        handleException(text);

        sc.close();
    }
}
