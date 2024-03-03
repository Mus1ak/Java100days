
public class Solution {
    public static void main(String[] args) {
        int nums[] = {1,1,2};
        System.out.println(singleNonDuplicate(nums));

    }   
    public static int singleNonDuplicate(int[] nums){
        int start = 0; 
        //brute force
        // int end = start + 1;
        // if(nums.length <= 1){
        //     return nums[0];
        // }

        // while(start < nums.length){
        //     if(nums[start] == nums[end]){
        //         start = end + 1;
        //         if(nums.length - 1 != start){
        //             end = start + 1;
        //         }
        //     }
        //     else{
        //         return nums[start];
        //     }
        // }
        // return -1;
        
        //optimized
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start)/2;
            if(mid % 2 == 1) mid--;
            if(nums[mid] == nums[mid+1]) start = mid + 2;
            else end = mid;
        }
        return nums[start];
    }
}
