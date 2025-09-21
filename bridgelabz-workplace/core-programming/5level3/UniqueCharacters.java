import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of a string without using length()
    public static int getStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Reached end of string
        }
        return count;
    }

    // Method to find unique characters using charAt()
    public static char[] findUniqueCharacters(String text) {
        int length = getStringLength(text);
        char[] tempUnique = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if currentChar already exists in tempUnique
            for (int j = 0; j < uniqueCount; j++) {
                if (tempUnique[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                tempUnique[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create array of exact size to store unique characters
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = tempUnique[i];
        }

        return uniqueChars;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String inputText = sc.nextLine();

        char[] uniqueChars = findUniqueCharacters(inputText);

        System.out.println("Unique characters in the text:");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }

        sc.close();
    }
}
