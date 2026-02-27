/**
 * ===============================================================
 * MAIN CLASS – UseCase13PalindromeCheckerApp
 * ===============================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution time
 * of palindrome validation algorithms.
 *
 * At this stage, the application:
 * - Uses a palindrome validation method
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * This use case focuses purely on performance measurement.
 *
 * @author Aradhya
 * @version 13.0
 */

public class UseCase13PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "level";

        System.out.println("Input : " + input);

        long startTime = System.nanoTime();

        boolean result = isPalindrome(input);

        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + duration + " ns");
    }

    /**
     * Checks palindrome using two-pointer approach
     */
    private static boolean isPalindrome(String word) {

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {

            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
