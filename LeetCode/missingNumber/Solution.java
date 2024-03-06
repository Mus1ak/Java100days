import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int nums[] = {0,1,2};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int temp[] = new int[n+1];
        for(int i=0; i<n; i++){
            temp[i] = nums[i];
        }

        for(int i=0; i<temp.length; i++){
            if(temp[i] != i){
                return i;
            }
        }
        return -1;
    }
}
