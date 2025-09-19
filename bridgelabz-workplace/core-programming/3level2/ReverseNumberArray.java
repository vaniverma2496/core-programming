import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Find count of digits
        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        // Step 3: Store digits in an array
        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10; // get last digit
            temp /= 10;            // remove last digit
        }

        // Step 4: Create another array to store reverse
        int[] reverseDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reverseDigits[i] = digits[count - 1 - i];
        }

        // Step 5: Display results
        System.out.print("Digits of number: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }

        System.out.println();

        System.out.print("Reversed number (array form): ");
        for (int d : reverseDigits) {
            System.out.print(d + " ");
        }

        System.out.println();

        // Also printing reversed as integer
        System.out.print("Reversed number: ");
        for (int d : reverseDigits) {
            System.out.print(d);
        }
        System.out.println();

        sc.close();
    }
}
