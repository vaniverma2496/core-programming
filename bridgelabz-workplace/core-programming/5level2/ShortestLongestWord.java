import java.util.Scanner;

public class ShortestLongestWord {

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

        // Count words
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
                sb.setLength(0);
            }
        }
        if (sb.length() > 0) {
            words[wordIndex] = sb.toString();
        }

        return words;
    }

    // Method to create 2D array of words and their lengths
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    // Method to find shortest and longest word indices in 2D array
    public static int[] findShortestLongest(String[][] wordLengths) {
        int shortestIndex = 0;
        int longestIndex = 0;
        int shortestLength = Integer.parseInt(wordLengths[0][1]);
        int longestLength = Integer.parseInt(wordLengths[0][1]);

        for (int i = 1; i < wordLengths.length; i++) {
            int len = Integer.parseInt(wordLengths[i][1]);
            if (len < shortestLength) {
                shortestLength = len;
                shortestIndex = i;
            }
            if (len > longestLength) {
                longestLength = len;
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Split into words
        String[] words = splitText(text);

        // Create 2D array with words and lengths
        String[][] wordLengths = wordsWithLengths(words);

        // Find shortest and longest words
        int[] shortestLongest = findShortestLongest(wordLengths);

        System.out.println("\nShortest word: " + wordLengths[shortestLongest[0]][0] +
                " (Length: " + wordLengths[shortestLongest[0]][1] + ")");
        System.out.println("Longest word: " + wordLengths[shortestLongest[1]][0] +
                " (Length: " + wordLengths[shortestLongest[1]][1] + ")");

        sc.close();
    }
}
