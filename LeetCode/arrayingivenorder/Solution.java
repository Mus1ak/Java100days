import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int nums[] = {0,1,2,3,4};
        int index[] = {0,1,2,2,1};

        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int res[] = new int[nums.length];
        for (int i=0; i< nums.length; i++){

            if(res[index[i]] != 0){
                for (int j = res.length - 1; j > index[i]; j--) {
                    res[j] = res[j - 1];
                }
            }

            res[index[i]] = nums[i];
        }
        return res;
    }
}
