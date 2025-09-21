import java.util.Scanner;

public class NumberChecker4 {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        int product = 1;
        for (int digit : digits) {
            sum += digit;
            product *= digit;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numberStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numberStr);
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    // Helper method to get digits array
    public static int[] getDigitsArray(int number) {
        int n = Math.abs(number);
        int count = 0;
        int temp = n;
        if (n == 0) return new int[]{0};
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int number = sc.nextInt();

        System.out.println("Number: " + number);
        System.out.println("Prime Number? " + isPrime(number));
        System.out.println("Neon Number? " + isNeonNumber(number));
        System.out.println("Spy Number? " + isSpyNumber(number));
        System.out.println("Automorphic Number? " + isAutomorphic(number));
        System.out.println("Buzz Number? " + isBuzzNumber(number));

        sc.close();
    }
}
