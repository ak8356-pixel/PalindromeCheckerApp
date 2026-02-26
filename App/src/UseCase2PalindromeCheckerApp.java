/**
 * ============================================================
 * MAIN CLASS – UseCase2PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * @author Aradhya Khadse
 * @version 2.0
 */

public class UseCase2PalindromeCheckerApp {

    /**
     * Application entry point for UC2.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Reverse string manually
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        // Display result
        System.out.println("======================================");
        System.out.println("PALINDROME CHECKER MANAGEMENT APP");
        System.out.println("======================================");

        System.out.println("Input Word: " + word);

        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("Result: The word is a PALINDROME.");
        } else {
            System.out.println("Result: The word is NOT a palindrome.");
        }
    }
}
