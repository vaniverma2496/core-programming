import java.util.Scanner;

public class CharacterFrequencyNested {

    // Method to find frequency of characters using nested loops
    public static String[][] charFrequency(String text) {
        char[] chars = text.toCharArray();
        int length = chars.length;
        int[] freq = new int[length];

        // Initialize frequencies
        for (int i = 0; i < length; i++) {
            freq[i] = 1; // Start with 1 for each character
        }

        // Nested loops to calculate frequency
        for (int i = 0; i < length; i++) {
            if (chars[i] == '0') continue; // Skip if already counted as duplicate
            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // Mark duplicate as counted
                }
            }
        }

        // Count number of unique characters
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') uniqueCount++;
        }

        // Create 2D array for character and frequency
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                result[index][0] = String.valueOf(chars[i]);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }

        return result;
    }

    // Method to display 2D array
    public static void displayFrequency(String[][] freqArray) {
        System.out.println("Character\tFrequency");
        System.out.println("-----------------------");
        for (int i = 0; i < freqArray.length; i++) {
            System.out.println(freqArray[i][0] + "\t\t" + freqArray[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String inputText = sc.nextLine();

        String[][] frequencyResult = charFrequency(inputText);

        displayFrequency(frequencyResult);

        sc.close();
    }
}
