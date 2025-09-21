import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[][] findCharFrequency(String text) {
        int[] freq = new int[256]; // Array to store frequency of all ASCII characters

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Count unique characters in text to create 2D array
        int uniqueCount = 0;
        boolean[] processed = new boolean[256]; // To avoid duplicates
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!processed[ch]) {
                uniqueCount++;
                processed[ch] = true;
            }
        }

        // Create 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        processed = new boolean[256]; // Reset processed array

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!processed[ch]) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                index++;
                processed[ch] = true;
            }
        }

        return result;
    }

    // Method to display the 2D array
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

        String[][] frequencyResult = findCharFrequency(inputText);

        displayFrequency(frequencyResult);

        sc.close();
    }
}
