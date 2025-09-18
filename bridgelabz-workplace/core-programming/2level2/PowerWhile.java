import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter the base number: ");
        int number = input.nextInt();

        System.out.print("Enter the power (exponent): ");
        int power = input.nextInt();

        // Check for non-negative exponent
        if (power < 0) {
            System.out.println("Please enter a non-negative exponent.");
        } else {
            int result = 1;       // Initialize result
            int counter = 0;      // Initialize counter

            // Loop until counter equals power
            while (counter < power) {
                result *= number;  // Multiply result by number
                counter++;         // Increment counter
            }

            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        input.close();
    }
}
