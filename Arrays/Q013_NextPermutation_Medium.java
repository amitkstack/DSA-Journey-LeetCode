/**
 * Question: Next Permutation (LeetCode #31)
 * Approach:-Find the first decreasing element from the right (pivot), swap it with the next larger element from the end, and then reverse the suffix starting after the pivot.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class Q013_NextPermutation_Medium {
    public void nextPermutation(int[] nums) {
        // find the pivot
        int pivot = -1;
        int n = nums.length;
        for(int i=n-2; i>=0; i--) {
            if(nums[i] < nums[i+1]) {
                pivot = i;
                break;
            }
        }

        if(pivot == -1) { // in place changes
            reverse(nums, 0, n - 1);
            return;
        }

        // 2nd  step : next larger element
        for(int i=n-1; i>pivot; i--) {
            if(nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }

        // 3rd step : reverse (piv+1 to n-1)
        int i= pivot+1, j = n-1;
        while(i <= j) {
            swap(nums, i++, j--);
        }

    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }
}
