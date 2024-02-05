public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,15,6,3};
        System.out.println(differenceOfSum(nums));
    }
    public static int differenceOfSum(int[] nums) {
        int elSum = 0;
        int digSum = 0;
        for (int i = 0; i < nums.length; i++){
            elSum += nums[i];
            int n = nums[i];
            while(n > 0){
                digSum += n%10;
                n = n/10;
            }
        }
        return (elSum - digSum);
    }
}
