import java.util.Arrays;

public class Q1MajorityElement{
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int freq = 0;
        int ans = 0;
        for(int i=0; i<n; i++) {
            if(freq == 0) {
                ans = nums[i];
            }
            if(ans == nums[i]) freq++;
            else freq--;
        }
        return ans;

        // Arrays.sort(nums);
        // int freq = 1;
        // int ans = nums[0];
        // for(int i=1; i<nums.length; i++) {
        //     if(nums[i] == nums[i-1]) freq++;
        //     else {
        //         freq = 1;
        //         ans = nums[i];
        //     }
        //     if(freq > (nums.length / 2)){
        //         return ans;
        //     }
        // }
        // return nums[0];

        // int ele = (nums.length) / 2;
        // for(int i=0; i<nums.length; i++) {
        //     int c = 0;
        //     for(int j=0; j<nums.length; j++){
        //         if(nums[i] == nums[j]){
        //             c++;
        //         }
        //     }
        //     if(c > ele) {
        //         return nums[i];
        //     }
        // }
        // return -1; // O(n^2)
    }
    public static void main(String[] args) {
        int nums[] = {1, 1, 1, 2, 2, 2, 2};
        System.out.println(majorityElement(nums));
    }
}
