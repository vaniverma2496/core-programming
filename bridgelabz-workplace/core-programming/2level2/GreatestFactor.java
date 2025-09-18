import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        int greatestFactor = 1;  // default value (1 is always a factor)

        // Check for positive number
        if (number > 1) {
            // Loop from number-1 down to 1
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {   // check divisibility
                    greatestFactor = i; // assign greatest factor
                    break;              // stop loop (first match will be the greatest)
                }
            }

            System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);
        } else {
            System.out.println("Please enter a number greater than 1.");
        }

        input.close();
    }
}
