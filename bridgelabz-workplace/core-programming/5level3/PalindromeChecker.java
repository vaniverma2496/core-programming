import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Iterative check using start and end indexes
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive check using start and end indexes
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays and reversed array
    public static boolean isPalindromeUsingCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];

        // Reverse the string into reversed array using charAt()
        for (int i = 0; i < original.length; i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }

        // Compare original and reversed arrays
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text to check palindrome: ");
        String inputText = sc.nextLine();

        // Remove spaces and make lowercase for uniform check
        inputText = inputText.replaceAll("\\s+", "").toLowerCase();

        // Logic 1
        boolean resultIterative = isPalindromeIterative(inputText);
        System.out.println("Palindrome Check (Iterative): " + resultIterative);

        // Logic 2
        boolean resultRecursive = isPalindromeRecursive(inputText, 0, inputText.length() - 1);
        System.out.println("Palindrome Check (Recursive): " + resultRecursive);

        // Logic 3
        boolean resultCharArray = isPalindromeUsingCharArray(inputText);
        System.out.println("Palindrome Check (Char Array Reversal): " + resultCharArray);

        sc.close();
    }
}
