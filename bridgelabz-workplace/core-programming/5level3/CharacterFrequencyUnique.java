import java.util.Scanner;

public class CharacterFrequencyUnique {

    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        int length = text.length();
        char[] temp = new char[length];
        int count = 0;

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            // Check if character already exists in temp array
            for (int j = 0; j < count; j++) {
                if (temp[j] == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[count] = ch;
                count++;
            }
        }

        // Create exact size array for unique characters
        char[] uniqueChars = new char[count];
        for (int i = 0; i < count; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Method to find frequency of characters using unique characters
    public static String[][] charFrequency(String text) {
        char[] uniqueChars = uniqueCharacters(text);
        String[][] freqArray = new String[uniqueChars.length][2];

        // Count frequency of each unique character
        for (int i = 0; i < uniqueChars.length; i++) {
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == uniqueChars[i]) {
                    count++;
                }
            }
            freqArray[i][0] = String.valueOf(uniqueChars[i]);
            freqArray[i][1] = String.valueOf(count);
        }

        return freqArray;
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

        String[][] frequencyResult = charFrequency(inputText);

        displayFrequency(frequencyResult);

        sc.close();
    }
}
