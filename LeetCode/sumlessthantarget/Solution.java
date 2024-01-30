import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(-6,2,5,-2,-7,-1,3));
        System.out.println(countPairs(nums, -2));
    }

    public static int countPairs(List<Integer> nums, int target){
        int count = 0;
        for (int i = 0; i < nums.size() ; i++) {
            for (int j = i+1; j < nums.size() ; j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }
        return count;
    }
}
