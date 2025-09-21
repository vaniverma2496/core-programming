import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random marks for Physics, Chemistry, and Maths
    public static int[][] generateScores(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3]; // [Physics, Chemistry, Maths]
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = (int)(Math.random() * 91) + 10; // Physics: 10-100
            scores[i][1] = (int)(Math.random() * 91) + 10; // Chemistry: 10-100
            scores[i][2] = (int)(Math.random() * 91) + 10; // Maths: 10-100
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateTotals(int[][] scores) {
        int numberOfStudents = scores.length;
        double[][] results = new double[numberOfStudents][3]; // [total, average, percentage]

        for (int i = 0; i < numberOfStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    // Method to display scorecard
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t");
            System.out.print((int)results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        // Step 1: Generate random scores
        int[][] scores = generateScores(numberOfStudents);

        // Step 2: Calculate total, average, percentage
        double[][] results = calculateTotals(scores);

        // Step 3: Display the scorecard
        displayScoreCard(scores, results);

        sc.close();
    }
}
