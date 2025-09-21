import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        // Accessing an index beyond array length
        System.out.println("Accessing element at index 10: " + names[10]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing element at index 10: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of names
        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        String[] names = new String[n];

        // Take input for names
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Demonstrate the exception
        System.out.println("\nDemonstrating ArrayIndexOutOfBoundsException:");
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e);
        }

        // Handle the exception properly
        System.out.println("\nHandling ArrayIndexOutOfBoundsException using try-catch:");
        handleException(names);

        sc.close();
    }
}
