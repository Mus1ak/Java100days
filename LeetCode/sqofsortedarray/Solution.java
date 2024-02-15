import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {-1,4,0,3,2};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }   
    public static int[] sortedSquares(int[] nums) {
        int sq[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            sq[i] = nums[i]*nums[i];
        }
        Arrays.sort(sq);
        return sq;
    } 
}
