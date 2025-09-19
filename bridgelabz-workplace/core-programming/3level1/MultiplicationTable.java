import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();

        // Step 2: Create an array to store results (1 to 10)
        int[] table = new int[10];

        // Step 3: Fill the array using a loop
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;  // store result at index i-1
        }

        // Step 4: Display the results in format
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}
