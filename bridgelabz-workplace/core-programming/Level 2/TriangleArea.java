import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for base and height in cm
        System.out.print("Enter base of triangle in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height of triangle in cm: ");
        double height = input.nextDouble();

        // Area in square centimeters
        double areaCm = 0.5 * base * height;

        // Convert to square inches
        double areaInches = areaCm / 6.4516;

        // Print result
        System.out.println("The Area of the triangle in sq in is " + areaInches +
                           " and sq cm is " + areaCm);

        input.close();
    }
}
