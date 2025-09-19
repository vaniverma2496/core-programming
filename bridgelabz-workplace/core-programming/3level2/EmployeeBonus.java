import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMP_COUNT = 10;
        double[] salary = new double[EMP_COUNT];
        double[] years = new double[EMP_COUNT];
        double[] bonus = new double[EMP_COUNT];
        double[] newSalary = new double[EMP_COUNT];

        double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;

        // Step 1: Take valid input for salary & years of service
        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter salary: ");
            double sal = sc.nextDouble();
            System.out.print("Enter years of service: ");
            double yrs = sc.nextDouble();

            if (sal <= 0 || yrs < 0) { 
                System.out.println("Invalid input! Please enter again.");
                i--; // decrement index to retry input for this employee
                continue;
            }

            salary[i] = sal;
            years[i] = yrs;
        }

        // Step 2: Calculate bonus, new salary, and totals
        for (int i = 0; i < EMP_COUNT; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Step 3: Display details
        System.out.println("\n--- Employee Salary Details ---");
        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
                    (i + 1), salary[i], bonus[i], newSalary[i]);
        }

        // Step 4: Display totals
        System.out.println("\n--- Company Totals ---");
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);

        sc.close();
    }
}
