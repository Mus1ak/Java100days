import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int nums[] = {4,4,9,10,10,9,3,8,4,2,5,3,8,6,1,10,4,5,3,2,3,9,5,7,10,4,9,10,1,10,4};
        System.out.println(maximizeSum(nums, 6));
    }
    public static int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[nums.length - 1];
            nums[nums.length - 1] = nums[nums.length - 1]+1;
        }
        return sum;
    }
}
