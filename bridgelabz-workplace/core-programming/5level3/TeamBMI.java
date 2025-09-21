import java.util.Scanner;

public class TeamBMI {

    // Method to calculate BMI and status for each person
    public static String[][] calculateBMI(double[][] heightWeightArray) {
        int numPersons = heightWeightArray.length;
        String[][] bmiStatusArray = new String[numPersons][4]; // height, weight, BMI, status

        for (int i = 0; i < numPersons; i++) {
            double weight = heightWeightArray[i][0]; // in kg
            double heightCm = heightWeightArray[i][1]; // in cm
            double heightM = heightCm / 100; // convert to meters
            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0) / 100.0; // round to 2 decimal places

            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 24.9) status = "Normal weight";
            else if (bmi < 29.9) status = "Overweight";
            else status = "Obese";

            bmiStatusArray[i][0] = String.valueOf(heightCm);
            bmiStatusArray[i][1] = String.valueOf(weight);
            bmiStatusArray[i][2] = String.valueOf(bmi);
            bmiStatusArray[i][3] = status;
        }
        return bmiStatusArray;
    }

    // Method to display the BMI table
    public static void displayBMI(String[][] bmiArray) {
        System.out.printf("%-8s%-10s%-10s%-15s%n", "Person", "Height(cm)", "Weight(kg)", "BMI Status");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < bmiArray.length; i++) {
            System.out.printf("%-8d%-10s%-10s%-15s%n",
                    i + 1,
                    bmiArray[i][0],
                    bmiArray[i][1],
                    bmiArray[i][3] + " (" + bmiArray[i][2] + ")");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPersons = 10;
        double[][] heightWeightArray = new double[numPersons][2];

        // Take user input for weight and height
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            heightWeightArray[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            heightWeightArray[i][1] = sc.nextDouble();
        }

        // Calculate BMI and status
        String[][] bmiResults = calculateBMI(heightWeightArray);

        // Display the BMI table
        displayBMI(bmiResults);

        sc.close();
    }
}
