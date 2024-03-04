import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int nums[] = {2,3,2,3,4};
        System.out.println(Arrays.toString(twoSum(nums,6)));
    }
    public static int[] twoSum(int[] nums, int target){
        //using HashMaps
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int b = target - a;

            if (map.containsKey(b)) {
                return new int[]{i, map.get(b)};
            }

            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
