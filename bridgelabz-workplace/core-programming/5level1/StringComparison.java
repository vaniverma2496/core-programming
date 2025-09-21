import java.util.Scanner;

public class StringComparison {

    // Method to compare two strings using charAt()
    public static boolean compareStringsCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // Strings of different lengths cannot be equal
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // If any character differs, strings are not equal
            }
        }
        return true; // All characters matched
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for two strings
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Compare using charAt() method
        boolean isEqualCharAt = compareStringsCharAt(str1, str2);
        System.out.println("\nComparison using charAt() method: " + (isEqualCharAt ? "Equal" : "Not Equal"));

        // Compare using built-in equals() method
        boolean isEqualBuiltIn = str1.equals(str2);
        System.out.println("Comparison using equals() method: " + (isEqualBuiltIn ? "Equal" : "Not Equal"));

        // Validate if both methods give the same result
        if (isEqualCharAt == isEqualBuiltIn) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Methods give different results.");
        }

        sc.close();
    }
}
