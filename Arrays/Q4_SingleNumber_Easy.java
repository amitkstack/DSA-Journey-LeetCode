/**
 * Question: Single Number (LeetCode #136)
 * Approach:- This approach leverages the XOR bitwise operator to cancel out duplicate numbers ($x \oplus x = 0$), leaving only the unique element that appears an odd number of times.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class Q4_SingleNumber_Easy {
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            ans = nums[i] ^ ans;
        }
        return ans;
    }
}
