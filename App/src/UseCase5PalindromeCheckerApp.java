import java.util.Stack;

/**
 * ============================================================
 * MAIN CLASS – UseCase5PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 5: Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 *
 * At this stage, the application:
 * - Pushes characters into a stack
 * - Pops them in reverse order
 * - Compares with original sequence
 * - Displays the result
 *
 * This maps stack behavior to reversal logic.
 *
 * @author Developer
 * @version 5.0
 */

public class UseCase5PalindromeCheckerApp {

    /**
     * Application entry point for UC5.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("PALINDROME CHECKER MANAGEMENT APP");
        System.out.println("=================================");

        // Hardcoded string for palindrome validation
        String word = "madam";

        // Create Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character into the stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Pop characters to build reversed string
        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Display input word
        System.out.println("Input Word: " + word);

        // Compare original and reversed strings
        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("Result: The word is a PALINDROME.");
        } else {
            System.out.println("Result: The word is NOT a palindrome.");
        }
    }
}