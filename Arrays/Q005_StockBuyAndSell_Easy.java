/**
 * Question: Best Time to Buy and Sell Stock (LeetCode #121)
 * Approach:- Iterate through the array while keeping track of the minimum price seen so far to calculate and update the maximum possible profit at each step.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class Q005_StockBuyAndSell_Easy {
    public static int maxProfit(int[] arr) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<arr.length; i++) {
            if(buyPrice < arr[i]) {
                int Profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, Profit);
            }
            else {
                buyPrice = arr[i];
            }
        }
        return maxProfit;
    }
}
