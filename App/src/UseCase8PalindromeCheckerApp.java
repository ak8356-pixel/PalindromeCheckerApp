import java.util.LinkedList;

/**
 * ============================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList.
 *
 * Characters are added to the list and then compared
 * by removing elements from both ends:
 *
 * - removeFirst()
 * - removeLast()
 *
 * This demonstrates how LinkedList supports
 * double-ended operations for symmetric validation.
 *
 * @author Aradhya
 * @version 8.0
 */

public class UseCase8PalindromeCheckerApp {

    /**
     * Application entry point for UC8.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("PALINDROME CHECKER MANAGEMENT APP");
        System.out.println("========================================");

        // Hardcoded string
        String word = "madam";

        // Create LinkedList
        LinkedList<Character> list = new LinkedList<>();

        // Add characters to LinkedList
        for (int i = 0; i < word.length(); i++) {
            list.add(word.charAt(i));
        }

        // Check palindrome
        boolean isPalindrome = true;

        while (list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input Word: " + word);

        if (isPalindrome) {
            System.out.println("Result: The word is a PALINDROME.");
        } else {
            System.out.println("Result: The word is NOT a palindrome.");
        }
    }
}