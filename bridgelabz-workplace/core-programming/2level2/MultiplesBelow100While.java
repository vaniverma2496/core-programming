import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check input
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");

            int counter = 100; // start from 100

            // Loop while counter is greater than or equal to 1
            while (counter >= 1) {
                if (counter % number == 0) {  // check if counter is a multiple
                    System.out.println(counter);
                }
                counter--; // decrement counter
            }
        }

        input.close();
    }
}

