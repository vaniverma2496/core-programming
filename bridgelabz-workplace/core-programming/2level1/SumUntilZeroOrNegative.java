import java.util.Scanner;

public class SumUntilZeroOrNegative{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0.0;  // To store the sum

        while (true) { // infinite loop
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = input.nextDouble();

            if (number <= 0) { // if user enters 0 or negative, stop
                break;
            }

            total += number; // add number to total
        }

        System.out.println("The total sum is: " + total);

        input.close();
    }
}
