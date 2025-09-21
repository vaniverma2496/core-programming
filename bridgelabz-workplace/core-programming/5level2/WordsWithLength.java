import java.util.Scanner;

public class WordsWithLength {

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
        int wordCount = 0;

        // Count number of words by counting spaces
        boolean inWord = false;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (text.charAt(i) == ' ') {
                inWord = false;
            }
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            } else if (sb.length() > 0) {
                words[wordIndex++] = sb.toString();
                sb.setLength(0); // reset StringBuilder
            }
        }
        if (sb.length() > 0) {
            words[wordIndex] = sb.toString();
        }

        return words;
    }

    // Method to return a 2D array with word and its length
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Split text into words
        String[] words = splitText(text);

        // Get 2D array of words and their lengths
        String[][] wordLengths = wordsWithLengths(words);

        // Display result in tabular format
        System.out.println("\nWord\tLength");
        System.out.println("------------");
        for (int i = 0; i < wordLengths.length; i++) {
            System.out.println(wordLengths[i][0] + "\t" + Integer.parseInt(wordLengths[i][1]));
        }

        sc.close();
    }
}
