import java.util.Scanner;

public class StudentVoteChecker {

    // Method to generate random 2-digit ages for n students
    public static int[] generateRandomAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int) (Math.random() * 83) + 18; // Age between 18 and 100
        }
        return ages;
    }

    // Method to check voting eligibility and return 2D array
    public static String[][] checkVotingEligibility(int[] ages) {
        int n = ages.length;
        String[][] result = new String[n][2];

        for (int i = 0; i < n; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "Cannot Vote (Invalid Age)";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayEligibility(String[][] data) {
        System.out.printf("%-10s%-20s%n", "Age", "Voting Eligibility");
        System.out.println("------------------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10s%-20s%n", data[i][0], data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for number of students (here 10)
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Generate random ages
        int[] ages = generateRandomAges(n);

        // Check voting eligibility
        String[][] eligibility = checkVotingEligibility(ages);

        // Display result
        displayEligibility(eligibility);

        sc.close();
    }
}
