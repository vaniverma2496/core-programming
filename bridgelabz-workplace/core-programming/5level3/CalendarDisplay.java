import java.util.Scanner;

public class CalendarDisplay {

    // Array to store month names
    private static final String[] MONTH_NAMES = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array to store days in each month (non-leap year)
    private static final int[] DAYS_IN_MONTH = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2) { // February
            return isLeapYear(year) ? 29 : 28;
        } else {
            return DAYS_IN_MONTH[month - 1];
        }
    }

    // Method to get the first day of the month using Gregorian Calendar formula
    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0; // 0=Sunday, 1=Monday, ..., 6=Saturday
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        System.out.println("     " + MONTH_NAMES[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        int daysInMonth = getDaysInMonth(month, year);

        // Print initial spaces for first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print all days
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) { // Move to next line after Saturday
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        displayCalendar(month, year);

        sc.close();
    }
}
