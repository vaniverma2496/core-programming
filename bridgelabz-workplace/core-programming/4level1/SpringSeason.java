public class SpringSeason {

    // Method to check if given month and day are in Spring Season
    public static boolean isSpringSeason(int month, int day) {
        // Spring is from March 20 (3/20) to June 20 (6/20)
        if ((month == 3 && day >= 20 && day <= 31) ||   // March 20–31
            (month == 4 && day >= 1 && day <= 30) ||    // April full month
            (month == 5 && day >= 1 && day <= 31) ||    // May full month
            (month == 6 && day >= 1 && day <= 20)) {    // June 1–20
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Taking input from command line arguments
        if (args.length < 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check and print result
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}

