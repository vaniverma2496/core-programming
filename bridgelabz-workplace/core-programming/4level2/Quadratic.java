import java.util.Scanner;

public class Quadratic {

    // Method to find roots of quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Not a quadratic equation (a cannot be 0).");
            return new double[] {};
        }

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] {root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[] {root};
        } else {
            // Delta negative, no real roots
            return new double[] {};
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a, b, c
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        // Find roots
        double[] roots = findRoots(a, b, c);

        // Display results
        if (roots.length == 2) {
            System.out.println("Two real roots: x1 = " + roots[0] + ", x2 = " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("One real root: x = " + roots[0]);
        } else {
            System.out.println("No real roots exist.");
        }

        sc.close();
    }
}
