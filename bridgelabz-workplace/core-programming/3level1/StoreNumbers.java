import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create array and variables
        double[] numbers = new double[10];  // store up to 10 numbers
        double total = 0.0;                 // sum of numbers
        int index = 0;                      // index for array

        // Step 2: Infinite loop to take input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();

            // Break if user enters 0 or negative
            if (num <= 0) {
                break;
            }

            // Break if array is full
            if (index == 10) {
                System.out.println("Array is full! Cannot store more numbers.");
                break;
            }

            // Store the number in array
            numbers[index] = num;
            index++;
        }

        // Step 3: Calculate total and show numbers
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }

        // Step 4: Show sum
        System.out.println("\n\nSum of all numbers = " + total);

        sc.close();
    }
}
