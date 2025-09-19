import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create an array of size 11
        double[] heights = new double[11];
        double sum = 0.0;

        // Step 2: Take user input for all 11 players
        System.out.println("Enter the heights of 11 football players (in cm):");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];  // Add to sum while reading
        }

        // Step 3: Calculate mean
        double mean = sum / heights.length;

        // Step 4: Display result
        System.out.println("\nThe mean height of the football team is: " + mean + " cm");

        sc.close();
    }
}
