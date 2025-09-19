import java.util.Scanner;

public class StudentMarks2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Step 2: Create 2D array [n][3] → rows = students, columns = subjects
        int[][] marks = new int[n][3]; // 3 subjects: Physics, Chemistry, Maths

        // Arrays to store percentage and grade
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Step 3: Take input for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();

            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();
        }

        // Step 4: Calculate percentage and grade
        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            percentage[i] = total / 3.0; // average marks

            // Assign grade based on percentage
            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 75) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else if (percentage[i] >= 40) grade[i] = 'D';
            else grade[i] = 'F';
        }

        // Step 5: Display results
        System.out.println("\n=== Student Results ===");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                    " -> Physics: " + marks[i][0] +
                    ", Chemistry: " + marks[i][1] +
                    ", Maths: " + marks[i][2] +
                    ", Percentage: " + percentage[i] + "%" +
                    ", Grade: " + grade[i]);
        }

        sc.close();
    }
}
