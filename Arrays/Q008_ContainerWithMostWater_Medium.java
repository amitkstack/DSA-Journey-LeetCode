/*
 * Question: Container With Most Water (LeetCode #11)
 * Approach:- The algorithm calculates the water area between two pointers and shifts the shorter bar's pointer inward, hoping to find a taller bar that compensates for the decreased width.
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */

public class Q008_ContainerWithMostWater_Medium {
    public static int maxArea(int[] height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.length-1;
        while(lp < rp) {
            int w = rp - lp;
            int ht = Math.min(height[rp], height[lp]);
            int currWater = w * ht;
            maxWater = Math.max(maxWater, currWater);
            if(height[lp] < height[rp]) lp++;
            else rp--;
        }
        return maxWater;

    }
}
