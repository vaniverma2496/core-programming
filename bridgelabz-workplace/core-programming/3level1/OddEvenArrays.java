import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Step 2: Check if input is valid (natural number)
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            return;
        }

        // Step 3: Create arrays for odd and even numbers
        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];

        int evenIndex = 0, oddIndex = 0;

        // Step 4: Iterate from 1 to number and separate odd/even
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex++] = i; // store in even array
            } else {
                odd[oddIndex++] = i;  // store in odd array
            }
        }

        // Step 5: Print odd numbers
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.println();

        // Step 6: Print even numbers
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

        sc.close();
    }
}

