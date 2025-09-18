import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Get user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int originalNumber = number; // store original number
        int sum = 0;                 // initialize sum to 0

        // Step 2: Use while loop to process each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10;       // get the last digit
            sum += digit * digit * digit;          // add cube of digit to sum
            originalNumber /= 10;                  // remove last digit
        }

        // Step 3: Check if sum equals original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }

        input.close();
    }
}
