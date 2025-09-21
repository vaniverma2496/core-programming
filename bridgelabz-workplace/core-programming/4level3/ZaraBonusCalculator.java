import java.util.Arrays;

public class ZaraBonusCalculator {

    // Method to generate salaries and years of service for 10 employees
    public static int[][] generateEmployeeData(int numberOfEmployees) {
        int[][] data = new int[numberOfEmployees][2]; // [salary, yearsOfService]
        for (int i = 0; i < numberOfEmployees; i++) {
            // 5-digit salary between 10000 to 99999
            data[i][0] = (int)(Math.random() * 90000) + 10000;
            // years of service between 1 and 10
            data[i][1] = (int)(Math.random() * 10) + 1;
        }
        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        int n = employeeData.length;
        double[][] updatedData = new double[n][3]; // [oldSalary, bonus, newSalary]

        for (int i = 0; i < n; i++) {
            double oldSalary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonusPercentage = (years > 5) ? 0.05 : 0.02;
            double bonusAmount = oldSalary * bonusPercentage;
            double newSalary = oldSalary + bonusAmount;

            updatedData[i][0] = oldSalary;
            updatedData[i][1] = bonusAmount;
            updatedData[i][2] = newSalary;
        }

        return updatedData;
    }

    // Method to display table and totals
    public static void displayBonusTable(double[][] updatedData) {
        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.printf("%-10s %-12s %-12s %-12s\n", "Employee", "Old Salary", "Bonus", "New Salary");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < updatedData.length; i++) {
            double oldSalary = updatedData[i][0];
            double bonus = updatedData[i][1];
            double newSalary = updatedData[i][2];

            System.out.printf("%-10d %-12.2f %-12.2f %-12.2f\n", i + 1, oldSalary, bonus, newSalary);

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;
        }

        System.out.println("--------------------------------------------------------");
        System.out.printf("%-10s %-12.2f %-12.2f %-12.2f\n", "Total", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int numberOfEmployees = 10;

        // Step 1: Generate random salary and years of service
        int[][] employeeData = generateEmployeeData(numberOfEmployees);

        // Step 2: Calculate bonus and new salary
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);

        // Step 3: Display table with totals
        displayBonusTable(updatedData);
    }
}
