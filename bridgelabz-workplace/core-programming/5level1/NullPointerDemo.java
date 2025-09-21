public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateNullPointerException() {
        String text = null; // Initialize to null
        // This will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle NullPointerException
    public static void handleNullPointerException() {
        String text = null; // Initialize to null
        try {
            // Attempt to access method on null object
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException:");
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\nHandling NullPointerException using try-catch:");
        handleNullPointerException();
    }
}
