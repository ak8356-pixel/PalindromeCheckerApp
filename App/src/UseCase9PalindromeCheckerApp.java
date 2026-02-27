/**
 * ============================================================
 * MAIN CLASS – UseCase9PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 *
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 *
 * The recursion stops when:
 * - All characters are matched, or
 * - A mismatch is found.
 *
 * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 *
 * @author Aradhya Khadse
 * @version 9.0
 */

public class UseCase9PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("PALINDROME CHECKER MANAGEMENT APP");
        System.out.println("====================================");

        // Hardcoded string for validation
        String word = "madam";

        System.out.println("Input Word: " + word);

        // Call recursive method
        boolean result = check(word, 0, word.length() - 1);

        if (result) {
            System.out.println("Result: The word is a PALINDROME.");
        } else {
            System.out.println("Result: The word is NOT a palindrome.");
        }
    }

    /**
     * Recursively checks whether a string is palindrome.
     *
     * @param s Input string
     * @param start Starting index
     * @param end Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {

        // Base case: all characters checked
        if (start >= end) {
            return true;
        }

        // If mismatch found
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call moving inward
        return check(s, start + 1, end - 1);
    }
}
