import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        // Attempt to parse an integer from text
        int number = Integer.parseInt(text); // This may throw NumberFormatException
        System.out.println("Parsed number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text); // Attempt to parse
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string to parse as integer: ");
        String text = sc.nextLine();

        // Demonstrate NumberFormatException
        System.out.println("\nDemonstrating NumberFormatException:");
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred: " + e);
        }

        // Handle NumberFormatException properly
        System.out.println("\nHandling NumberFormatException using try-catch:");
        handleException(text);

        sc.close();
    }
}
