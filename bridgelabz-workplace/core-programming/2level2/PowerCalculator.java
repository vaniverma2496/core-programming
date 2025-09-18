import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the base number: ");
        int number = input.nextInt();

        System.out.print("Enter the power (exponent): ");
        int power = input.nextInt();

        // Check for positive integers
        if (power < 0) {
            System.out.println("Please enter a non-negative exponent.");
        } else {
            int result = 1;

            // For loop to calculate power
            for (int i = 1; i <= power; i++) {
                result *= number;  // result = result * number
            }

            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        input.close();
    }
}
