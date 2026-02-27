/**
 * ==============================================================
 * MAIN CLASS – UseCase10PalindromeCheckerApp
 * ==============================================================
 *
 * Use Case 10: Normalized Palindrome Validation
 *
 * Description:
 * This class validates a palindrome after preprocessing
 * the input string.
 *
 * Normalization includes:
 * - Removing spaces and symbols
 * - Converting to lowercase
 *
 * This ensures the palindrome check is logical rather
 * than character-format dependent.
 *
 * Example:
 * "A man a plan a canal Panama"
 *
 * @author Developer
 * @version 10.0
 */
public class UseCase10PalindromeCheckerApp {

    /**
     * Application entry point for UC10.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("PALINDROME CHECKER MANAGEMENT APP");
        System.out.println("====================================");

        // Original input string
        String input = "A man a plan a canal Panama";

        // Normalize string: remove non-letters and convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Reverse normalized string
        String reversed = "";
        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed += normalized.charAt(i);
        }

        // Display input and normalized form
        System.out.println("Original Input : " + input);
        System.out.println("Normalized     : " + normalized);

        // Compare normalized and reversed
        if (normalized.equals(reversed)) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}