import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int nums[] = {10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }   
    
    public static int[] leftRightDifference(int[] nums) {
        int rSum[] = new int[nums.length];
        int lSum[] = new int[nums.length];
        int answer[] = new int[nums.length];

        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                rSum[i] += nums[j];
            }
        }
        
        for (int i = 1; i < nums.length; i++) {
            lSum[i] = lSum[i - 1] + nums[i - 1];
        }
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Math.abs(lSum[i] - rSum[i]);
        }

        return answer;
    }

}
