import java.util.Scanner;

public class VowelConsonantCharacterType {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkChar(char ch) {
        // Convert uppercase to lowercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string and return a 2D array
    public static String[][] findCharTypes(String text) {
        // Find string length without using length()
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string
        }

        // Create 2D array to store character and its type
        String[][] charTypes = new String[length][2];
        for (int i = 0; i < length; i++) {
            charTypes[i][0] = String.valueOf(text.charAt(i));
            charTypes[i][1] = checkChar(text.charAt(i));
        }

        return charTypes;
    }

    // Method to display 2D array in a tabular format
    public static void displayCharTypes(String[][] charTypes) {
        System.out.printf("%-10s%-15s%n", "Character", "Type");
        System.out.println("------------------------");
        for (int i = 0; i < charTypes.length; i++) {
            System.out.printf("%-10s%-15s%n", charTypes[i][0], charTypes[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Find character types
        String[][] charTypes = findCharTypes(text);

        // Display in tabular format
        displayCharTypes(charTypes);

        sc.close();
    }
}

