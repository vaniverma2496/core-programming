import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = 1;

            // For loop to calculate factorial
            for (int i = 1; i <= number; i++) {
                factorial *= i;  // factorial = factorial * i
            }

            // Print the result
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        input.close();
    }
}
