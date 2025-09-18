import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Get user input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int sum = 0; // Initialize sum of divisors

        // Step 2: Find sum of proper divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // Check if i is a divisor
                sum += i;          // Add divisor to sum
            }
        }

        // Step 3: Check if number is abundant
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is NOT an Abundant Number.");
        }

        input.close();
    }
}
