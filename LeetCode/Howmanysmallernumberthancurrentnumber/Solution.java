import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int nums[] = {8,1,2,2,3};

        System.out.println(Arrays.toString(count(nums)));

    }
    public static int[] count(int[] nums){
        int ans[] = new int[nums.length];
        for (int i = 0; i < ans.length ; i++) {
            int count = 0;
            for (int j = 0; j < ans.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
                ans[i] = count;
            }
        }
        return ans;
    }
}