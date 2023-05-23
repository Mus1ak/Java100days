//link : https://leetcode.com/problems/single-number/description/
public class Solution {
    public static void main(String[] args) {
        int[] nums = { 3, 3, 7, 10, 10 };
        System.out.println(singleNumber(nums));
    }

    static int singleNumber(int[] nums) {
        int occ[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            occ[i] = Count(nums, nums[i]);
        }
        for (int i = 0; i < occ.length; i++) {
            if (occ[i] == 1) {
                return nums[i];
            }
        }
        return 0;

    }
// first we are counting the number one by one and this n will get inputed by the for loop that is above it.
    static int Count(int[] nums, int n) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n) {
                count++;
            }
        }
        return count;
    }
}
