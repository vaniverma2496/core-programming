import java.util.Arrays;

public class NumberChecker {

    // Method to count digits in a number
    public static int countDigits(int number) {
        int count = 0;
        int n = Math.abs(number);
        if (n == 0) return 1; // special case for 0
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

    // Method to check if number is a duck number (contains non-zero digit)
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int[] digits = getDigitsArray(number);
        int numDigits = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, numDigits);
        }
        return sum == number;
    }

    // Method to find largest and second largest in digits array
    public static int[] findLargestAndSecondLargest(int number) {
        int[] digits = getDigitsArray(number);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find smallest and second smallest in digits array
    public static int[] findSmallestAndSecondSmallest(int number) {
        int[] digits = getDigitsArray(number);
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153; // Example number, can be changed

        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));

        int[] digitsArray = getDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digitsArray));

        System.out.println("Is Duck Number? " + isDuckNumber(number));
        System.out.println("Is Armstrong Number? " + isArmstrong(number));

        int[] largestDigits = findLargestAndSecondLargest(number);
        System.out.println("Largest and Second Largest digits: " + Arrays.toString(largestDigits));

        int[] smallestDigits = findSmallestAndSecondSmallest(number);
        System.out.println("Smallest and Second Smallest digits: " + Arrays.toString(smallestDigits));
    }
}
