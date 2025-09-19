import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Define an array of 5 elements
        int[] numbers = new int[5];

        // Step 2: Take user input for 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Step 3: Loop through the array and check conditions
        System.out.println("\nChecking each number:");
        for (int num : numbers) {
            if (num > 0) {
                // Positive numbers → check even or odd
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }

        // Step 4: Compare the first and last elements
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        System.out.println("\nComparison of first and last elements:");
        if (first == last) {
            System.out.println("First element (" + first + ") is equal to last element (" + last + ")");
        } else if (first > last) {
            System.out.println("First element (" + first + ") is greater than last element (" + last + ")");
        } else {
            System.out.println("First element (" + first + ") is less than last element (" + last + ")");
        }

        sc.close();
    }
}
