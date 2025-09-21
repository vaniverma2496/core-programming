import java.util.Arrays;

public class NumberChecker2 {

    // Method to count digits in a number
    public static int countDigits(int number) {
        int n = Math.abs(number);
        if (n == 0) return 1; // Special case for 0
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    // Method to store digits in an array
    public static int[] getDigitsArray(int number) {
        int n = Math.abs(number);
        int size = countDigits(n);
        int[] digits = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    // Method to find sum of digits
    public static int sumOfDigits(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquaresOfDigits(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
        if (sum == 0) return false; // Avoid division by zero
        return number % sum == 0;
    }

    // Method to find frequency of each digit
    public static int[][] digitFrequency(int number) {
        int[] digits = getDigitsArray(number);
        int[][] freq = new int[10][2]; // 10 digits (0-9)
        
        // Initialize first column with digits 0-9
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        // Count frequency
        for (int digit : digits) {
            freq[digit][1]++;
        }

        return freq;
    }

    public static void main(String[] args) {
        int number = 21; // Example number, can be changed

        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));

        int[] digitsArray = getDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digitsArray));

        System.out.println("Sum of digits: " + sumOfDigits(number));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(number));
        System.out.println("Is Harshad Number? " + isHarshadNumber(number));

        int[][] freq = digitFrequency(number);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) { // Print only digits present
                System.out.println("Digit " + freq[i][0] + " occurs " + freq[i][1] + " time(s)");
            }
        }
    }
}
