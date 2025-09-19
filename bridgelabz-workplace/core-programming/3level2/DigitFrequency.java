

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take number input
        System.out.print("Enter a number: ");
        long number = sc.nextLong(); // long to handle large numbers

        // Step 2: Convert number into digits array
        String numStr = Long.toString(number);
        int len = numStr.length();
        int[] digits = new int[len];

        for (int i = 0; i < len; i++) {
            digits[i] = numStr.charAt(i) - '0'; // convert char to int
        }

        // Step 3: Frequency array (for digits 0–9)
        int[] freq = new int[10];

        // Step 4: Count frequency of each digit
        for (int d : digits) {
            freq[d]++;
        }

        // Step 5: Display result
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) { // only show digits that appear
                System.out.println("Digit " + i + " -> " + freq[i] + " times");
            }
        }

        sc.close();
    }
}

