import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character
    public static char findFirstNonRepeatingChar(String text) {
        int[] frequency = new int[256]; // Array to store frequency of all ASCII characters

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (frequency[ch] == 1) {
                return ch;
            }
        }

        // If all characters are repeating, return a special value
        return '\0'; // null character
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String inputText = sc.nextLine();

        char firstNonRepeating = findFirstNonRepeatingChar(inputText);

        if (firstNonRepeating != '\0') {
            System.out.println("The first non-repeating character is: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character found in the text.");
        }

        sc.close();
    }
}
