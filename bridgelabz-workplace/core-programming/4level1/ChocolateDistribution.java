import java.util.Scanner;

public class ChocolateDistribution {

    // Method to find remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;   // chocolates per child
        int remainder = number % divisor;  // leftover chocolates
        return new int[]{remainder, quotient};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();

        // Prevent division by zero
        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero!");
            sc.close();
            return;
        }

        // Call method
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Display results
        System.out.println("Each child will get " + result[1] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[0]);

        sc.close();
    }
}
