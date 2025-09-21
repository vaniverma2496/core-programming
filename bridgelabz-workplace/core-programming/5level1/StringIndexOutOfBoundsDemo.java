import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException(String text) {
        // Accessing index beyond the length of the string
        System.out.println("Character at index 10: " + text.charAt(10));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleStringIndexOutOfBoundsException(String text) {
        try {
            System.out.println("Character at index 10: " + text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("\nDemonstrating StringIndexOutOfBoundsException:");
        try {
            generateStringIndexOutOfBoundsException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\nHandling StringIndexOutOfBoundsException using try-catch:");
        handleStringIndexOutOfBoundsException(text);

        sc.close();
    }
}

