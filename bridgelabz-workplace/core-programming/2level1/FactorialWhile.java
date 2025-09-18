import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = 1; // Start with 1 (multiplicative identity)
            int i = 1;

            // While loop to calculate factorial
            while (i <= number) {
                factorial *= i;  // factorial = factorial * i
                i++;
            }

            // Print the result
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        input.close();
    }
}


