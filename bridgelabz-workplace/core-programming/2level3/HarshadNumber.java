import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Get user input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int originalNumber = number; // store original number
        int sum = 0;                 // initialize sum of digits

        // Step 2: Calculate sum of digits
        while (number != 0) {
            int digit = number % 10;  // get last digit
            sum += digit;             // add to sum
            number /= 10;             // remove last digit
        }

        // Step 3: Check divisibility
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Harshad Number.");
        }

        input.close();
    }
}
