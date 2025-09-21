import java.util.Arrays;

public class NumberChecker3 {

    // Method to count digits in a number
    public static int countDigits(int number) {
        int n = Math.abs(number);
        if (n == 0) return 1;
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

    // Method to reverse the digits array
    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }

    // Method to check if a number is a duck number (has non-zero digit)
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int digit : digits) {
            if (digit != 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 1221; // Example number

        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));

        int[] digitsArray = getDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digitsArray));

        int[] reversedArray = reverseArray(digitsArray);
        System.out.println("Reversed digits array: " + Arrays.toString(reversedArray));

        System.out.println("Is Palindrome? " + isPalindrome(number));
        System.out.println("Is Duck Number? " + isDuckNumber(number));
    }
}
