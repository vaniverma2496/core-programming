import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Get user input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int originalNumber = number; // store original number
        int count = 0;               // initialize count to 0

        // Handle negative numbers
        number = Math.abs(number);

        // Step 2: Use loop to count digits
        if (number == 0) {
            count = 1; // 0 has 1 digit
        } else {
            while (number != 0) {
                number /= 10;  // remove last digit
                count++;       // increment count
            }
        }

        // Step 3: Display result
        System.out.println("The number " + originalNumber + " has " + count + " digits.");

        input.close();
    }
}

