public class Solution {
    public static void main(String[] args) {
        int nums[] = {3,1,3,3,2};
        System.out.println(majority(nums));
    }
    public static int majority(int[] nums){
        int count = 0;
        int majorityEl = 0;

        for (int i = 0; i < nums.length; i++) {
            if(count == 0) majorityEl = nums[i];
            if(majorityEl == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == majorityEl){
                count++;
            }
        }
        if(count > nums.length/2){
            return majorityEl;
        }else{
            return -1;
        }
    }
}
