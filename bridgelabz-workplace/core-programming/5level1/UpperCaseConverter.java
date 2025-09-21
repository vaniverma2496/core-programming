import java.util.Scanner;

public class UpperCaseConverter {

    // Method to convert text to uppercase using charAt() and ASCII logic
    public static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                // Convert lowercase to uppercase using ASCII difference
                ch = (char) (ch - 32);
            }
            result.append(ch);
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Convert using user-defined method
        String upperCustom = convertToUpperCase(text);

        // Convert using built-in method
        String upperBuiltIn = text.toUpperCase();

        // Compare the two results
        boolean isEqual = compareStrings(upperCustom, upperBuiltIn);

        // Display results
        System.out.println("\nUppercase using custom method: " + upperCustom);
        System.out.println("Uppercase using built-in method: " + upperBuiltIn);
        System.out.println("Are both results equal? " + isEqual);

        sc.close();
    }
}
