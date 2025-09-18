import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        int greatestFactor = 1;  // default value
        int counter = number - 1; // start from one less than the number

        // Check for valid input
        if (number > 1) {
            // Run loop while counter >= 1
            while (counter >= 1) {
                if (number % counter == 0) {   // check divisibility
                    greatestFactor = counter;  // assign greatest factor
                    break;                     // exit the loop
                }
                counter--; // decrement counter
            }

            System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);
        } else {
            System.out.println("Please enter a number greater than 1.");
        }

        input.close();
    }
}
