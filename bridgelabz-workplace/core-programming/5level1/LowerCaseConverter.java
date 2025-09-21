import java.util.Scanner;

public class LowerCaseConverter {

    // Method to convert text to lowercase using charAt() and ASCII logic
    public static String convertToLowerCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                // Convert uppercase to lowercase using ASCII difference
                ch = (char) (ch + 32);
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
        String lowerCustom = convertToLowerCase(text);

        // Convert using built-in method
        String lowerBuiltIn = text.toLowerCase();

        // Compare the two results
        boolean isEqual = compareStrings(lowerCustom, lowerBuiltIn);

        // Display results
        System.out.println("\nLowercase using custom method: " + lowerCustom);
        System.out.println("Lowercase using built-in method: " + lowerBuiltIn);
        System.out.println("Are both results equal? " + isEqual);

        sc.close();
    }
}
