/**
 * Question: Valid Palindrome (LeetCode #125)
 * Approach:-Skip non-alphanumeric characters using two pointers from both ends, compare the remaining characters by converting them to lowercase, and return false if any mismatch occurs.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Q001_ValidPalindrome_Easy {
    public boolean isPalindrome(String s) {
        int st = 0, end = s.length() - 1;
        while (st < end) {
            while (st < end && !Character.isLetterOrDigit(s.charAt(st))) {
                st++;
            }
            while (st < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            if (Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }

            st++;
            end--;
        }
        return true;
    }
}
