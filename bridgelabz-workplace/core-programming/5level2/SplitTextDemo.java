import java.util.Scanner;

public class SplitTextDemo {

    // Method to find length of string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string
        }
        return count;
    }

    // Method to split text into words using charAt() without split()
    public static String[] splitText(String text) {
        int length = findLength(text);
        int wordCount = 1; // At least one word

        // Count spaces to determine number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store start and end indexes of words
        int[] startIndexes = new int[wordCount];
        int[] endIndexes = new int[wordCount];

        int wordIndex = 0;
        startIndexes[wordIndex] = 0; // First word starts at 0

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                endIndexes[wordIndex] = i - 1;
                wordIndex++;
                startIndexes[wordIndex] = i + 1; // Next word starts after space
            }
        }
        endIndexes[wordIndex] = length - 1; // Last word ends at last character

        // Extract words using indexes
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = startIndexes[i]; j <= endIndexes[i]; j++) {
                sb.append(text.charAt(j));
            }
            words[i] = sb.toString();
        }

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Split using user-defined method
        String[] customWords = splitText(text);

        // Split using built-in split() method
        String[] builtInWords = text.split(" ");

        // Compare results
        boolean isEqual = compareStringArrays(customWords, builtInWords);

        // Display results
        System.out.println("\nWords using custom method:");
        for (String word : customWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split() method:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nAre both results equal? " + isEqual);

        sc.close();
    }
}

