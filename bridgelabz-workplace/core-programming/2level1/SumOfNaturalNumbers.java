import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Compute sum using while loop
            int sumWhile = 0;
            int counter = 1;
            while (counter <= n) {
                sumWhile += counter;
                counter++;
            }

            // Compute sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Print both results
            System.out.println("Sum using while loop: " + sumWhile);
            System.out.println("Sum using formula   : " + sumFormula);

            // Compare results
            if (sumWhile == sumFormula) {
                System.out.println(" Both computations are correct and match!");
            } else {
                System.out.println(" Results do not match. Something went wrong.");
            }
        }

        input.close();
    }
}
