import java.util.Arrays;

class Solution{
    public static void main(String[] args) {
        int nums[] = {2,5,1,4,6,3};
        System.out.println(findKthLargest(nums, 2));
    }
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums); // 1 2 3 4 5 
        
        int res = 0;
        if(nums.length == 1){
            res = nums[0];
            
        }else if(nums.length == 2){
            res = nums[nums.length -1];
        }
        for(int i= nums.length - 1; i>=0; i--){           
            
            if(i == nums.length - k){
                res = nums[i];
            }
        }
        return res;
    }
}