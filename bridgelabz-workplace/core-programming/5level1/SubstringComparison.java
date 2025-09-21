import java.util.Scanner;

public class SubstringComparison {

    // Method to create substring using charAt()
    public static String createSubstringCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i); // Append each character
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Create substring using charAt()
        String substringCharAt = createSubstringCharAt(text, start, end);
        System.out.println("\nSubstring using charAt(): " + substringCharAt);

        // Create substring using built-in substring() method
        String substringBuiltIn = text.substring(start, end);
        System.out.println("Substring using built-in substring(): " + substringBuiltIn);

        // Compare the two substrings
        boolean isEqual = compareStringsCharAt(substringCharAt, substringBuiltIn);
        System.out.println("Are both substrings equal? " + (isEqual ? "Yes" : "No"));

        sc.close();
    }
}
