import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in centimeters: ");
        double heightCm = input.nextDouble();

        // Step 2: Convert height to meters
        double heightM = heightCm / 100.0;

        // Step 3: Calculate BMI
        double bmi = weight / (heightM * heightM);

        // Step 4: Determine weight status
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal weight";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Step 5: Display result
        System.out.printf("BMI = %.2f%n", bmi);
        System.out.println("Weight status: " + status);

        input.close();
    }
}
