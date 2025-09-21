import java.util.Scanner;

public class TriangularParkRun {

    // Method to calculate number of rounds
    public static double calculateRounds(double side1, double side2, double side3, double distance) {
        double perimeter = side1 + side2 + side3;
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for three sides
        System.out.print("Enter side 1 of the triangular park (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of the triangular park (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of the triangular park (in meters): ");
        double side3 = sc.nextDouble();

        // Distance to complete (5 km = 5000 meters)
        double distance = 5000;

        // Calculate rounds
        double rounds = calculateRounds(side1, side2, side3, distance);

        // Display result (rounds can be fractional, so we show decimal)
        System.out.println("The athlete must complete " + rounds + " rounds to cover 5 km.");

        sc.close();
    }
}
