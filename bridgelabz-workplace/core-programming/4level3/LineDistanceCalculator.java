import java.util.Scanner;

public class LineDistanceCalculator {

    // Method to compute Euclidean distance between two points
    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to compute slope (m) and y-intercept (b) of the line passing through two points
    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double m, b;
        if (x2 - x1 != 0) {
            m = (y2 - y1) / (x2 - x1); // slope
            b = y1 - m * x1;           // y-intercept
        } else {
            // Vertical line case: slope is infinite, set b as NaN
            m = Double.POSITIVE_INFINITY;
            b = Double.NaN;
        }
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Calculate Euclidean distance
        double distance = euclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance between points: %.4f\n", distance);

        // Calculate line equation
        double[] line = lineEquation(x1, y1, x2, y2);
        if (Double.isInfinite(line[0])) {
            System.out.println("The line is vertical: x = " + x1);
        } else {
            System.out.printf("Equation of the line: y = %.4f*x + %.4f\n", line[0], line[1]);
        }

        sc.close();
    }
}
