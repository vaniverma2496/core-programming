import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Prime numbers are greater than 1
        if (number <= 1) {
            System.out.println(number + " is NOT a prime number.");
        } else {
            boolean isPrime = true;  // assume number is prime

            // Loop from 2 to number-1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) { // divisible by i
                    isPrime = false;   // number is not prime
                    break;             // exit loop
                }
            }

            // Display result
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is NOT a prime number.");
            }
        }

        input.close();
    }
}
