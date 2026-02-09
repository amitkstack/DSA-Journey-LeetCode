/**
 * Question: Search a 2D Matrix (LeetCode #74)
 * Approach:- The approach is a Brute Force Linear Search that scans every element of the matrix row-by-row until the target is found or all elements are exhausted.
 * Time Complexity: O(M * N)
 * Space Complexity: O(1)
 */

public class Q012_SearchIn2dMatrix_Medium {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
