import java.util.Scanner;

public class TrigonometricFunctions {

    // Method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle to radians
        double radians = Math.toRadians(angle);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter an angle in degrees: ");
        double angle = sc.nextDouble();

        // Call method
        double[] results = calculateTrigonometricFunctions(angle);

        // Display results
        System.out.printf("Sine(%f°) = %.4f\n", angle, results[0]);
        System.out.printf("Cosine(%f°) = %.4f\n", angle, results[1]);
        System.out.printf("Tangent(%f°) = %.4f\n", angle, results[2]);

        sc.close();
    }
}
