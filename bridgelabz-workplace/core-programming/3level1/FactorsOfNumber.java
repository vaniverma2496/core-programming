import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize array and variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Step 3: Find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Check if array is full, double the size
                if (index == maxFactor) {
                    maxFactor *= 2; // double size
                    int[] temp = new int[maxFactor];
                    
                    // Copy old factors into temp
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp; // reassign
                }

                // Add factor to array
                factors[index++] = i;
            }
        }

        // Step 4: Display factors
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        sc.close();
    }
}
