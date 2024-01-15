import java.util.Arrays;

public class Solution{
    public static void main(String[] args) {
        int[] num = {1,2,3};
        System.out.println(goodpair(num));

    }
    public static int goodpair(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > 0; j--) {
                if (nums[i] == nums [j] & i<j) {
                    count++;
                }
            }
        }
        return count;
    }

}