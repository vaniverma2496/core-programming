import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year rules:
        // Divisible by 4 AND not divisible by 100 OR divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        // Check for valid Gregorian year
        if (year < 1582) {
            System.out.println("Invalid input! Year must be 1582 or later.");
            sc.close();
            return;
        }

        // Check leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        sc.close();
    }
}
