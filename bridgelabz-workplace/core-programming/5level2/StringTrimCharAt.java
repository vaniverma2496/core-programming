import java.util.Scanner;

public class StringTrimCharAt {

    // Method to find start and end indices after trimming spaces
    public static int[] findTrimIndices(String text) {
        int start = 0;
        int end = 0;

        // Find string length without using length()
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // end of string
        }

        // Find first non-space character from start
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                start = i;
                break;
            }
        }

        // Find last non-space character from end
        for (int i = length - 1; i >= 0; i--) {
            if (text.charAt(i) != ' ') {
                end = i;
                break;
            }
        }

        return new int[]{start, end};
    }

    // Method to create substring from start to end index using charAt()
    public static String substringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        // Find lengths without using length()
        int len1 = 0, len2 = 0;
        try {
            while (true) {
                str1.charAt(len1);
                len1++;
            }
        } catch (IndexOutOfBoundsException e) {}
        try {
            while (true) {
                str2.charAt(len2);
                len2++;
            }
        } catch (IndexOutOfBoundsException e) {}

        if (len1 != len2) return false;

        for (int i = 0; i < len1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string with spaces: ");
        String text = sc.nextLine();

        // Find start and end indices after trimming
        int[] indices = findTrimIndices(text);

        // Create trimmed substring using charAt()
        String trimmedCustom = substringUsingCharAt(text, indices[0], indices[1]);

        // Built-in trim() method
        String trimmedBuiltIn = text.trim();

        // Compare the two results
        boolean isEqual = compareStrings(trimmedCustom, trimmedBuiltIn);

        // Display results
        System.out.println("Trimmed using charAt(): \"" + trimmedCustom + "\"");
        System.out.println("Trimmed using built-in trim(): \"" + trimmedBuiltIn + "\"");
        System.out.println("Both results are equal? " + isEqual);

        sc.close();
    }
}
