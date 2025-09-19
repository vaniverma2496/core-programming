import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Step 2: Validate input
        if (number <= 0) {
            System.out.println("Please enter a positive integer!");
            return;
        }

        // Step 3: Create String array to store results
        String[] results = new String[number + 1]; // index 0 to number

        // Step 4: Loop from 0 to number
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0 && i != 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0 && i != 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Step 5: Print results in required format
        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        sc.close();
    }
}
