import java.util.Scanner;

public class StringCharArrayComparison {

    // Method to return all characters of a string as an array without using toCharArray()
    public static char[] getCharacters(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    // Method to display a character array
    public static void displayCharArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Get characters using user-defined method
        char[] userDefinedChars = getCharacters(text);
        System.out.print("Characters from user-defined method: ");
        displayCharArray(userDefinedChars);

        // Get characters using built-in toCharArray() method
        char[] builtInChars = text.toCharArray();
        System.out.print("Characters from built-in toCharArray(): ");
        displayCharArray(builtInChars);

        // Compare the two arrays
        boolean isEqual = compareCharArrays(userDefinedChars, builtInChars);
        System.out.println("Are both character arrays equal? " + (isEqual ? "Yes" : "No"));

        sc.close();
    }
}
