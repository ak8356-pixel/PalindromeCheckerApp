import java.util.Deque;
import java.util.ArrayDeque;

/**
 * ================================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 7: Deque Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue).
 *
 * Characters are inserted into the deque and then
 * compared by removing elements from both ends:
 *
 * - removeFirst()
 * - removeLast()
 *
 * This avoids reversing the string and provides an
 * efficient front-to-back comparison approach.
 *
 * This use case demonstrates optimal bidirectional
 * traversal using Deque.
 *
 * @author Developer
 * @version 7.0
 */
public class UseCase7PalindromeCheckerApp {

    /**
     * Application entry point for UC7.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("PALINDROME CHECKER MANAGEMENT APP");
        System.out.println("========================================");

        // Hardcoded string for palindrome validation
        String word = "madam";

        // Create Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare front and rear characters
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display input
        System.out.println("Input Word: " + word);

        // Display result
        if (isPalindrome) {
            System.out.println("Result: The word is a PALINDROME.");
        } else {
            System.out.println("Result: The word is NOT a palindrome.");
        }
    }
}