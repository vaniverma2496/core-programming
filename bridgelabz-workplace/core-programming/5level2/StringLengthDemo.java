import java.util.Scanner;

public class StringLengthDemo {

    // Method to find length of string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // Try to access character at index count
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Reached the end of string
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Find length using user-defined method
        int customLength = findLength(text);

        // Find length using built-in method
        int builtInLength = text.length();

        // Display results
        System.out.println("\nLength using custom method: " + customLength);
        System.out.println("Length using built-in length() method: " + builtInLength);

        sc.close();
    }
}
