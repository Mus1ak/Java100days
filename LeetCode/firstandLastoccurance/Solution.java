import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int nums[] = {1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(firstnLast(nums, 3)));
    }
    public static int[] firstnLast(int nums[], int target){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                int left = mid;
                int right = mid;

                while (left > 0 && nums[left - 1] == target) {
                    left--;
                }
                while (right < nums.length && nums[right + 1] == target) {
                    right++;
                }

                return new int[]{left, right};
            }
            else if(nums[mid] < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}
