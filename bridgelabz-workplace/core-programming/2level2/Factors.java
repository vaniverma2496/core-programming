import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if it's a positive integer
        if (number > 0) {
            System.out.println("Factors of " + number + " are:");

            // Loop from 1 to number
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {   // check divisibility
                    System.out.println(i); // i is a factor
                }
            }
        } else {
            System.out.println("The number " + number + " is not a positive integer.");
        }

        input.close();
    }
}

