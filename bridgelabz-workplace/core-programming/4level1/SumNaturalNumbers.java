import java.util.Scanner;

public class SumNaturalNumbers {

    // Method to calculate sum of n natural numbers
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;   // add each number
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Calling method
        int result = findSum(n);

        // Output
        System.out.println("The sum of first " + n + " natural numbers is: " + result);

        sc.close();
    }
}
