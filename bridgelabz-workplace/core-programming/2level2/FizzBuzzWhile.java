import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if it's a positive integer
        if (number > 0) {
            int i = 1;   // counter variable
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++; // increment counter
            }
        } else {
            System.out.println("The number " + number + " is not a positive integer.");
        }

        input.close();
    }
}

