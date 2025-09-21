import java.util.Scanner;

public class NumberAnalyzer {

    // Method to check if a number is positive
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // Method to check if a number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to compare two numbers
    // Returns 1 if number1 > number2, 0 if equal, -1 if number1 < number2
    public static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        else if (number1 == number2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Analyze each number
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (isPositive(num)) {
                System.out.print(num + " is Positive");
                if (isEven(num)) {
                    System.out.println(" and Even");
                } else {
                    System.out.println(" and Odd");
                }
            } else {
                System.out.println(num + " is Negative");
            }
        }

        // Compare first and last element
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        if (result == 1) {
            System.out.println("First element (" + numbers[0] + ") is greater than last element (" + numbers[numbers.length - 1] + ")");
        } else if (result == -1) {
            System.out.println("First element (" + numbers[0] + ") is less than last element (" + numbers[numbers.length - 1] + ")");
        } else {
            System.out.println("First element (" + numbers[0] + ") is equal to last element (" + numbers[numbers.length - 1] + ")");
        }

        sc.close();
    }
}

