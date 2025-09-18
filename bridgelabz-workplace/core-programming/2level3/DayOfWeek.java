public class DayOfWeek {
    public static void main(String[] args) {
        // Check if 3 arguments are provided
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            return;
        }

        // Step 1: Parse command-line arguments
        int m = Integer.parseInt(args[0]); // month (1-12)
        int d = Integer.parseInt(args[1]); // day (1-31)
        int y = Integer.parseInt(args[2]); // year

        // Step 2: Adjust month and year for Zeller's Congruence
        if (m < 3) { // January and February are counted as months 13 and 14 of previous year
            m += 12;
            y -= 1;
        }

        int k = y % 100;   // Year of the century
        int j = y / 100;   // Zero-based century

        // Step 3: Zeller's Congruence formula for Gregorian calendar
        int h = (d + 13*(m + 1)/5 + k + k/4 + j/4 + 5*j) % 7;

        // Step 4: Convert h to 0 = Sunday, 1 = Monday, ..., 6 = Saturday
        int dayOfWeek = ((h + 6) % 7);

        System.out.println("Day of week (0 = Sunday, 1 = Monday, ..., 6 = Saturday): " + dayOfWeek);
    }
}

