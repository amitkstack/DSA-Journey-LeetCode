/**
 * Question: Merge 2 sorted array without extra space (LeetCode #88)
 * Approach:- Used a Three-Pointer technique to merge arrays from back to front by placing the largest elements at the end of A first, ensuring an in-place merge without overwriting data.
 * Time Complexity: O(n+m)
 * Space Complexity: O(1)
 */

public class Q3_Merge2SortedArrayWithoutExtraSpace_Easy {
    public void merge(int[] A, int m, int[] B, int n) {
        int idx = m + n - 1;
        int i = m - 1, j = n - 1;
        while(i >= 0 && j >= 0){
            if(A[i] >= B[j]){
                A[idx--] = A[i--];
            } else {
                A[idx--] = B[j--];
            }
        }
        while(j >= 0){
            A[idx--] = B[j--];
        }
    }
}
