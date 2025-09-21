import java.util.Arrays;

public class RandomNumbersStats {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate random 4-digit number between 1000 and 9999
            numbers[i] = (int)(Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    // Method to find average, min, and max of an array
    public static double[] findAverageMinMax(int[] numbers) {
        if (numbers.length == 0) return new double[] {};

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            sum += num;
        }

        double average = sum / (double) numbers.length;

        return new double[] {average, min, max};
    }

    public static void main(String[] args) {
        // Generate 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));

        // Find average, min, max
        double[] stats = findAverageMinMax(randomNumbers);

        System.out.printf("Average: %.2f\n", stats[0]);
        System.out.println("Minimum: " + (int)stats[1]);
        System.out.println("Maximum: " + (int)stats[2]);
    }
}
