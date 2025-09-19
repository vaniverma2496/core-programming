import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Define array to store digits
        int maxDigit = 10;  // max allowed digits
        int[] digits = new int[maxDigit];
        int index = 0;

        // Step 3: Extract digits
        while (number != 0) {
            int digit = number % 10;   // last digit
            digits[index] = digit;     // store in array
            index++;

            if (index == maxDigit) {
                System.out.println("Reached maximum digits limit (10). Remaining digits not stored.");
                break;
            }
            number = number / 10;  // remove last digit
        }

        // Step 4: Find largest and second largest
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // update second largest
                largest = digits[i];     // update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Step 5: Display results
        System.out.print("Digits stored in array: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("Second largest digit: Not found (all digits are same or only one digit).");
        }

        sc.close();
    }
}

