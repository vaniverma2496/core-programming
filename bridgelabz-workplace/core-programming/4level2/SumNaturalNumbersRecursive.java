import java.util.Scanner;

public class SumNaturalNumbersRecursive {

    // Method to calculate sum using recursion
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumRecursive(n - 1);
        }
    }

    // Method to calculate sum using formula n*(n+1)/2
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if it is a natural number
        if (n <= 0) {
            System.out.println("Invalid input! Please enter a natural number.");
            sc.close();
            return;
        }

        // Sum using recursion
        int sumRec = sumRecursive(n);

        // Sum using formula
        int sumFor = sumFormula(n);

        // Display results
        System.out.println("Sum of first " + n + " natural numbers using recursion: " + sumRec);
        System.out.println("Sum of first " + n + " natural numbers using formula: " + sumFor);

        // Compare results
        if (sumRec == sumFor) {
            System.out.println("Both computations are correct and give the same result.");
        } else {
            System.out.println("There is a mismatch in the results!");
        }

        sc.close();
    }
}
