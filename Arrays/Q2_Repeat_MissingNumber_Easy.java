/**
 * Question: Find Missing and Repeated Values (LeetCode #2965)
 * Approach:- Using the numbers from 1 to n^2 as indices in a frequency array to count their occurrences.
 * Time Complexity: O(n^2)
 * Space Complexity: O(n^2)
 */


public class Q2_Repeat_MissingNumber_Easy {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int arr[] = new int[2];
        int size = grid.length;
        int newArr[] = new int[(size*size)+1];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                int n = grid[i][j];
                newArr[n]++;
            }
        }
        for(int i=1; i<newArr.length; i++){
            if(newArr[i] > 1){
                arr[0] = i;
            }
            if(newArr[i] == 0){
                arr[1] = i;
            }
        }
        if(arr[1] == 0){
            arr[1] = newArr.length;
        }
        return arr;
    }
}
