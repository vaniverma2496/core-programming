import java.util.Arrays;

public class NumberChecker5 {

    // Method to find factors of a number and return as array
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find greatest factor from factors array
    public static int greatestFactor(int[] factors) {
        int max = factors[0];
        for (int f : factors) {
            if (f > max) max = f;
        }
        return max;
    }

    // Method to find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    // Method to find product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    // Method to find product of cubes of factors
    public static long productOfCubesOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    // Method to check perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        return sum == number;
    }

    // Method to check abundant number
    public static boolean isAbundantNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        return sum > number;
    }

    // Method to check deficient number
    public static boolean isDeficientNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        return sum < number;
    }

    // Method to check strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int n = number;
        while (n > 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }
        return sum == number;
    }

    // Helper method to calculate factorial
    public static int factorial(int num) {
        if (num == 0 || num == 1) return 1;
        int fact = 1;
        for (int i = 2; i <= num; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        int number = 28; // Example number

        System.out.println("Number: " + number);

        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));

        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productOfCubesOfFactors(factors));

        System.out.println("Perfect Number? " + isPerfectNumber(number));
        System.out.println("Abundant Number? " + isAbundantNumber(number));
        System.out.println("Deficient Number? " + isDeficientNumber(number));
        System.out.println("Strong Number? " + isStrongNumber(number));
    }
}
