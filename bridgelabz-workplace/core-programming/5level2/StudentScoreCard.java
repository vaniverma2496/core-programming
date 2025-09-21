import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random marks for PCM subjects for n students
    public static int[][] generateRandomMarks(int numStudents) {
        int[][] marks = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Maths
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = 50 + (int)(Math.random() * 51); // random marks from 50 to 100
            }
        }
        return marks;
    }

    // Method to calculate total, average, percentage for each student
    public static double[][] calculateTotalAveragePercentage(int[][] marks) {
        int numStudents = marks.length;
        double[][] results = new double[numStudents][3]; // total, average, percentage
        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            double average = total / 3.0;
            double percentage = average; // Since total/300 * 100 is same as average
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to calculate grade based on percentage
    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 90) grades[i] = "A+";
            else if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B+";
            else if (percentage >= 60) grades[i] = "B";
            else if (percentage >= 50) grades[i] = "C";
            else grades[i] = "F";
        }
        return grades;
    }

    // Method to display the scorecard
    public static void displayScoreCard(int[][] marks, double[][] results, String[] grades) {
        System.out.printf("%-8s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n",
                "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
        System.out.println("-------------------------------------------------------------------------------");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-8d%-10d%-10d%-10d%-10.2f%-10.2f%-10.2f%-10s%n",
                    i + 1, marks[i][0], marks[i][1], marks[i][2],
                    results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();

        // Generate random marks
        int[][] marks = generateRandomMarks(numStudents);

        // Calculate total, average, percentage
        double[][] results = calculateTotalAveragePercentage(marks);

        // Calculate grades
        String[] grades = calculateGrades(results);

        // Display scorecard
        displayScoreCard(marks, results, grades);

        sc.close();
    }
}
